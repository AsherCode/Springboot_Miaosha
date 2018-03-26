
package com.itmayiedu.service.user2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmayiedu.user1.User1Mapper;
import com.itmayiedu.user2.User2Mapper;

@Service
public class User2Service {
	@Autowired
	private User2Mapper user2Mapper;

	public int addUser(String name, Integer age) {
		return user2Mapper.addUser(name, age);
	}

}
