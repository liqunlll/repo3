package com.guigu.jwt.entity;

/**
 * @ProjectName: jwt
 * @Package: com.guigu.jwt.entity
 * @ClassName: ResultCode
 * @Author: MrLi
 * @Description: ${description}
 * @Date: 2020/6/11 15:29
 * @Version: 1.0
 */
public enum  ResultCode {
    LOGIN_SUCCESS(1,"登录成功"),
    VOILD_SUCCESS(3,"校验成功");

    int code;
    String message;

    ResultCode(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
