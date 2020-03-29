package com.ktv.exception;

import com.ktv.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KtvException extends RuntimeException{
    private ExceptionEnums exceptionEnums;
}
