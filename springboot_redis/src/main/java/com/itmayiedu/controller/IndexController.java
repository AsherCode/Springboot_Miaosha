package com.itmayiedu.controller;

import com.itmayiedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjian on 2018/3/26.
 */
@RestController
public class IndexController {
    @Autowired
    private UserService userService;
    @RequestMapping("/setString")
    public String setString(String key,String value){
        userService.setString(key,value);
        return "success";
    }
    @RequestMapping("/setList")
    public String setList(String key){
        List<String> stringList = new ArrayList<String>();
        stringList.add("123");
        stringList.add("456");
        userService.setList(key,stringList);
        return "success";
    }
    @RequestMapping("/getKey")
    public String getKey(String key){
        return userService.getStringkey(key);
    }
}
