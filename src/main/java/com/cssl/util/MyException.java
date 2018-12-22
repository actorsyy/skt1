package com.cssl.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyException {
    @ExceptionHandler
    public String doException(Exception e){
        System.out.println(e.getMessage());
        return "error";
    }
}
