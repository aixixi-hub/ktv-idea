package com.ktv.web.filter;


import com.ktv.enums.ExceptionEnums;
import com.ktv.utils.JsonUtils;
import com.ktv.utils.JwtTokenUtils;
import com.ktv.utils.ResponseResult;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class AuthFilter extends ZuulFilter {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取RequestContext
        RequestContext requestContext = RequestContext.getCurrentContext();
        try {
            //得到request
            HttpServletRequest request = requestContext.getRequest();
            //如果是访问登陆请求，那么就不需要校验token
            //如果说是访问swagger 也不需要校验token
            if(request.getRequestURI().contains("/ktv-auth")|| request.getRequestURI().contains("/v2/api-docs")){
                //就表示放行
                return null;
            }
            //获取token
            String token = request.getHeader(JwtTokenUtils.TOKEN_HEADER);
            if(StringUtils.isBlank(token)){
                //如果token为空，那么直接返回数据给客户端
                errorResponse(requestContext,ExceptionEnums.TOKEN_ERROE);
            } else {
                //从redis中取token，key为用户名  value为token
                //如果是传了一半的token，那么这个方法就会抛出异常
                //调用全局异常处理机制（CrmException)?不行
                //Exception
                String username = JwtTokenUtils.getUsername(token);
                /**
                 *  redisToken为空  redis token过期了
                 */
                String redisToken = redisTemplate.opsForValue().get(username);
                //token正常
                if(token.equals(redisToken)&&!JwtTokenUtils.isExpiration(token)){
                    return null;
                }else {
                    //token失效
                    errorResponse(requestContext,ExceptionEnums.TOKEN_ERROE);
                }
            }
        } catch (Exception e) {
            errorResponse(requestContext,ExceptionEnums.TOKEN_ERROE);
        }

        return null;
    }

    public void errorResponse(RequestContext requestContext,ExceptionEnums exceptionEnums){
        //设置响应类型
        requestContext.addZuulResponseHeader("content-type","application/json;charset=utf-8");
        //设置响应状态码
        requestContext.setResponseStatusCode(exceptionEnums.TOKEN_ERROE.getCode());
        //设置响应信息 json
        requestContext.setResponseBody(JsonUtils.serialize(new ResponseResult(exceptionEnums)));
        //阻止请求转发
        requestContext.setSendZuulResponse(false);
    }
}

