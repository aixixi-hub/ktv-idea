package com.ktv.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnums {
    SUCCESS(200,"请求成功"),
    PRAM_IS_NULL(400,"参数为空"),
    UN_LOGIN(401,"没有登录"),
    USERNAME_OR_PASSWORD_ERROR(402,"用户名密码错误"),
    TOKEN_ERROE(403,"token失效");
    /*
        发生异常的状态码
     */
    private int code;
    /*
        异常信息
    */
    private String msg;
}
