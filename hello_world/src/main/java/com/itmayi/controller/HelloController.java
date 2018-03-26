package com.itmayi.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian on 2018/3/25.
 */
@RestController
//@EnableAutoConfiguration    //一个项目不能启动两个
public class HelloController {
    @RequestMapping("hello2")
    public String hello2(){
        return "hello2";
    }
    @RequestMapping("test2")
    public String test2(){
        int i = 1/0;
        return "test2";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class,args);
//    }
}
