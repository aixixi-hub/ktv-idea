package com.ktv.handler;

import com.ktv.exception.KtvException;
import com.ktv.utils.ResponseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(KtvException.class)
    public ResponseEntity handler(KtvException e){
        return ResponseEntity.status(e.getExceptionEnums().getCode())
                .body(new ResponseResult(e.getExceptionEnums()));
    }

}
