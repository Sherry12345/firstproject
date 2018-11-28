package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.NeoProperties;
import com.example.demo.entity.User;

@RestController
public class HelloWorldController {
	
	@Autowired
	private NeoProperties prop;
	
	private final static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	
	@RequestMapping("/hello")
	public String index() {
		System.out.println("===================" + prop.getTitle());
		logger.info(prop.getTitle());
		return "Hello World";
	}
	
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setUsername("zhangsan");
		user.setPassword("123456");
		
		return user;
	}
}
