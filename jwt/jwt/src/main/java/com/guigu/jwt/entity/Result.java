package com.guigu.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: jwt
 * @Package: com.guigu.jwt.entity
 * @ClassName: Result
 * @Author: MrLi
 * @Description: ${description}
 * @Date: 2020/6/11 15:23
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String message;
    private Object data;

    public Result(ResultCode resultCode){
        this.code = resultCode.code;
        this.message = resultCode.message;
    }
    public Result(ResultCode resultCode,Object data){
        this.code = resultCode.code;
        this.message = resultCode.message;
        this.data = data;
    }
}
