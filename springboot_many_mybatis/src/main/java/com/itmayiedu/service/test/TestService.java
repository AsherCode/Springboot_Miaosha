
package com.itmayiedu.service.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmayiedu.service.user1.User1Service;
import com.itmayiedu.service.user2.User2Service;
import com.itmayiedu.user1.User1Mapper;
import com.itmayiedu.user2.User2Mapper;

@Service
public class TestService {
	// @Autowired
	// private User1Service user1Service;
	// @Autowired
	// private User2Service user2Service;
	@Autowired
	private User1Mapper user1Mapper;
	@Autowired
	private User2Mapper user2Mapper;

	@Transactional
	public String test() {
		user1Mapper.addUser("db user001", 19);
		int i = 1 / 0;
		user2Mapper.addUser("db user001", 19);
		return "success";

	}

}
