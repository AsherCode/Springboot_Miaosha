package com.itmayi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjian on 2018/3/25.
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(ModelMap map){
        map.addAttribute("name","wangjian");
        map.put("sex",1);
        List<String> userList = new ArrayList<String>();
        userList.add("zhangsan");
        userList.add("李四");
        map.addAttribute("userlist",userList);
        return "index";
    }
}
