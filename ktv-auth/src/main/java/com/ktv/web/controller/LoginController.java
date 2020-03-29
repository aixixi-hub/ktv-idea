package com.ktv.web.controller;


import com.ktv.client.UserClient;
import com.ktv.enums.ExceptionEnums;
import com.ktv.exception.KtvException;
import com.ktv.utils.JwtTokenUtils;
import com.ktv.utils.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
class User {
    private String username;
    private String password;
}

@RestController
@RequestMapping("/auth")
@Api(value = "ktv-userset",tags = {"用户登陆登出管理"})
public class LoginController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserClient userClient;

    @PostMapping("/login")
    @ApiOperation("用户登陆")
    public ResponseEntity login(@RequestBody User user) {
        //要去查询数据库
        String username = user.getUsername();
        String password = user.getPassword();
        Object obj = userClient.login(username, password);
        if (obj != null) {
            //1.登陆成功，就需要产生token
            String token = JwtTokenUtils.createToken(username);
            //4.把token存入Redis
            redisTemplate.opsForValue().set(username, token);
            redisTemplate.expire(username, JwtTokenUtils.EXPIRATION, TimeUnit.MILLISECONDS);

            //2.响应回去

            /**
             *   3.怎么去校验token
             *      1.判断请求携带过来的token是否与我们登陆回去的token是否一致
             *          登陆成功以后需要把token存入到Redis中
             *      2.判断token是否过期
             */
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(ExceptionEnums.USERNAME_OR_PASSWORD_ERROR
                    .getCode()).body(new ResponseResult(ExceptionEnums.USERNAME_OR_PASSWORD_ERROR));
        }
    }

    @GetMapping("/info")
    @ApiOperation("用户查看")
    public ResponseEntity info(HttpServletRequest request){
        String token = request.getHeader(JwtTokenUtils.TOKEN_HEADER);
        if(StringUtils.isBlank(token)){
            throw new KtvException(ExceptionEnums.TOKEN_ERROE);
        }
        return ResponseEntity.ok(JwtTokenUtils.getUsername(token));
    }

    @GetMapping("/logout")
    @ApiOperation("用户登出")
    public ResponseEntity logout(HttpServletRequest request){
        //  获取token
        String token = request.getHeader(JwtTokenUtils.TOKEN_HEADER);
        if(StringUtils.isBlank(token)){
            throw new KtvException(ExceptionEnums.TOKEN_ERROE);
        }
        String username = JwtTokenUtils.getUsername(token);
        redisTemplate.delete(username);
        return  ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
