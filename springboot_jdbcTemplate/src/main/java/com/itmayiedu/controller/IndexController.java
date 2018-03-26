
package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.UserService;

@RestController
public class IndexController {
	@Autowired
	private UserService userService;

	@RequestMapping("/restIndex")
	public String restIndex() {
		userService.createUser(6,"jdbc:" + System.currentTimeMillis(), "123456");
		return "success";
	}

}
