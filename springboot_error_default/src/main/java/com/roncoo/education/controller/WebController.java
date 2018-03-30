/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.roncoo.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring-boot-demo-9-2
 *
 * @author wujing
 */
@Controller
@RequestMapping(value = "/web")
public class WebController {

	@RequestMapping(value = "index")
	public String index(ModelMap map) {
		map.put("title", "freemarker hello word");
		return "index"; // 开头不要加上/，linux下面会出错
	}
//	http://localhost:8080/web/123默认查找public/error/404.html
	@RequestMapping(value = "error")	//抛出异常templates/error/5xx.ftl
	public String error(ModelMap map) {
		throw new RuntimeException("测试异常");
	}

}
