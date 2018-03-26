
package com.itmayiedu.controller;

import com.itmayiedu.service.test.TestService;
import com.itmayiedu.service.user1.User1Service;
import com.itmayiedu.service.user2.User2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
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

}
