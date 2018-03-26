
package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.dao.UserDao;
import com.itmayiedu.entity.User;

@RestController
public class IndexController {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/index")
	public String index(Integer id) {

		User findUser = userDao.findOne(id);
		System.out.println(findUser.getUsername());
		return "success";
	}

}
