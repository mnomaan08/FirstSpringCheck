package com.example.rest.check.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.check.entity.User;
import com.example.rest.check.service.UserService;
import com.example.rest.check.service.UserServiceImpl;

@RestController
public class HelloWorldRestController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/greetings/{userName}",method=RequestMethod.GET,headers="Accept=application/json",produces="application/json")
	public User getGreetingUser(@PathVariable String userName){
		User user = new User();
		user.setUserName(userName);
		user.setMessage("Hello "+user.getUserName());
		userService.saveMessage(user);
		return user;
	}
	@RequestMapping(value="/greetings",method=RequestMethod.GET,headers="Accept=application/json",produces="application/json")
	public User getGreeting(){
		User user = new User();
		user.setMessage("Hello ");
		
		return user;
	}
	
}
