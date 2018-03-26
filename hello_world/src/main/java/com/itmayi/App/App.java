package com.itmayi.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wangjian on 2018/3/25.
 */
@ComponentScan(basePackages = "com.itmayi.controller")//将多个Controller类交给一个应用程序
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
    //静态资源http://localhost:8080/img/d.png
}
