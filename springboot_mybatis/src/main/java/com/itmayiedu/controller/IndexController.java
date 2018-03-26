
package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.entity.User;
import com.itmayiedu.mapper.UserMapper;

@RestController
public class IndexController {
	@Autowired
	private UserMapper userMapper;
	@RequestMapping("/mybatis")
	public String mybatis() {
		User user = userMapper.findByName("jdbc:1521988915842");
		System.out.println(user.getUsername());
		return "suceess";
	}
}
