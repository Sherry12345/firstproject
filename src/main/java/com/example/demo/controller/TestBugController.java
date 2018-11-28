package com.example.demo.controller;

import com.example.demo.entity.User;

public class TestBugController {
	
	
	public void test(String flag) {
		User user = null;
		
		if(flag != null) {
			user = new User();
			user.setUsername("test");
		}
		
		String name = user.getUsername();
		
		
	}

}
