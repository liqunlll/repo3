package com.guigu.jwt.controller;

import com.guigu.jwt.entity.Result;
import com.guigu.jwt.entity.ResultCode;
import com.guigu.jwt.utils.JWTUtils;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: jwt
 * @Package: com.guigu.jwt.controller
 * @ClassName: UserController
 * @Author: MrLi
 * @Description: ${description}
 * @Date: 2020/6/11 15:21
 * @Version: 1.0
 */
@RestController
public class UserController {
    @GetMapping("login")
    public Result login(){
        String jwt = JWTUtils.buildJWT("1");
        return new Result(ResultCode.LOGIN_SUCCESS,jwt);
    }
    @GetMapping("volid")
    public Result volid(String jwt){
        jwt = JWTUtils.vaildToken(jwt);
        return new Result(ResultCode.VOILD_SUCCESS,jwt);
    }
}
