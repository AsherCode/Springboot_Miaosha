
package com.itmayiedu.service.user2;

import com.itmayiedu.user2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User2Service {
	@Autowired
	private User2Mapper user2Mapper;

	public int addUser(String name, Integer age) {
		return user2Mapper.addUser(name, age);
	}

}
