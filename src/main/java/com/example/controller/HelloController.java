package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        //项目经理修改代码
        //开发人员修改代码第二次
        return "git hehe3366 开发人员使用dev123分支";
    }
}
