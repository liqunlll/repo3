package com.guigu.jwt.controller;

import com.guigu.jwt.entity.Result;
import com.guigu.jwt.exception.ResultException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ProjectName: jwt
 * @Package: com.guigu.jwt.controller
 * @ClassName: ControllerAdvice
 * @Author: MrLi
 * @Description: ${description}
 * @Date: 2020/6/11 15:22
 * @Version: 1.0
 */
@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(ResultException.class)
    public Result resultException(ResultException exception){
        return new Result(exception.getCode(),exception.getMessage(),null);
    }
}
