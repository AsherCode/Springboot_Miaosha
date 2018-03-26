
package com.itmayiedu.service.user1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmayiedu.user1.User1Mapper;

@Service
public class User1Service {
	@Autowired
	private User1Mapper user1Mapper;


	public int addUser(String name, Integer age) {
		return user1Mapper.addUser(name, age);
	}

}
