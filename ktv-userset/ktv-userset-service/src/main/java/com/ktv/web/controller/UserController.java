package com.ktv.web.controller;

import com.ktv.bean.User;
import com.ktv.enums.ExceptionEnums;
import com.ktv.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value = "ktv-userset",tags = {"用户管理"})
public class UserController {

    @Autowired
    private UserService service;

    /**
     *  此处返回User 而不是ResponseEnty是因为我门这个服务并不是给前端人员去使用，
     *  而是交给 ktv-auth服务去调用
     */

    @PostMapping("/findByNameAndPassword")
    @ApiOperation("根据名字验证密码")
    public User findByNameAndPassword(String username, String password){
        return service.findByNameAndPassword(username,password);
    }

    @GetMapping("/selectAll")
    @ApiOperation("查询所有用户")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/update")
    @ApiOperation("修改角色信息")
    public ResponseEntity update(@RequestBody User user){
        service.updateOrSave(user);
        return ResponseEntity.ok(ExceptionEnums.SUCCESS);
    }

}
