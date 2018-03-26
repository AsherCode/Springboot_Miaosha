package com.itmayi.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian on 2018/3/25.
 */
@RestController //默认每个Controller方法加上@ResponseBody,每个请求方法返回json
//@EnableAutoConfiguration//让Springboot根据应用声明的依赖对Spring框架进行自动配置
public class TestController {
    @RequestMapping("/hello")
    public String Hello(){
        return "success";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(TestController.class,args);
//    }
}
