
package com.itmayiedu.service.user1;

import com.itmayiedu.user1.User1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User1Service {
	@Autowired
	private User1Mapper user1Mapper;


	public int addUser(String name, Integer age) {
		return user1Mapper.addUser(name, age);
	}

}
