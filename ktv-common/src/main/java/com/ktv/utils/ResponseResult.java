package com.ktv.utils;

import com.ktv.enums.ExceptionEnums;
import lombok.Data;


import java.util.Date;
@Data
public class ResponseResult {
    private int code;
    private String msg;
    private Long time;

    public ResponseResult(ExceptionEnums exceptionEnums){
        this.code = exceptionEnums.getCode();
        this.msg = exceptionEnums.getMsg();
        this.time = new Date().getTime();
    }
}
