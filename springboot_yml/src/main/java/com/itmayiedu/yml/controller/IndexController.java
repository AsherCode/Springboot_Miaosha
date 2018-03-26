
package com.itmayiedu.yml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {//http://localhost:8090/itmayiedu/getTest

	@RequestMapping("/getTest")
	public String getTest() {
		return "success";
	}

}
