package com.guigu.jwt.exception;

import lombok.Data;

import javax.xml.transform.Result;

/**
 * @ProjectName: jwt
 * @Package: com.guigu.jwt.exception
 * @ClassName: ResultException
 * @Author: MrLi
 * @Description: ${description}
 * @Date: 2020/6/11 15:10
 * @Version: 1.0
 */
@Data
public class ResultException extends RuntimeException{
    private Integer code;
    private String message;

    private static volatile ResultException RESULT_EXCEPTION = null;

    private ResultException(){

    }
    public static ResultException of(Integer code,String message){
        if(RESULT_EXCEPTION == null){
            synchronized (ResultException.class){
                if(RESULT_EXCEPTION == null){
                    RESULT_EXCEPTION = new ResultException();
                }
            }
        }
        RESULT_EXCEPTION.setCode(code);
        RESULT_EXCEPTION.setMessage(message);
        return RESULT_EXCEPTION;
    }
}
