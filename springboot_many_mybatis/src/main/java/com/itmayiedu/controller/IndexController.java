
package com.itmayiedu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.test.TestService;
import com.itmayiedu.service.user1.User1Service;
import com.itmayiedu.service.user2.User2Service;

@RestController
public class IndexController {
	private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private User1Service user1Service;
	@Autowired
	private User2Service user2Service;
	@Autowired
	private TestService testService;

	@RequestMapping("/user1Service")
	public String index() {
		user1Service.addUser("db user001", 19);
		user2Service.addUser("db user002", 19);
		return "success";
	}

	@RequestMapping("/test2")
	public String test2() {
		testService.test();
		return "success";
	}

	@RequestMapping("/logTest")
	public String logTest() {
		LOG.info("###IndexController###logTest()");
		return "success";
	}
	@ResponseBody
	@RequestMapping("/testAop")
	public String testAop(String username,Integer age){
		user1Service.addUser(username,age);
		return "success";
	}
}
