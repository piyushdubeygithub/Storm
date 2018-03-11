package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;


@RestController
public class MainController {
	@Autowired
	UserService userService;
     @RequestMapping(value="/register/user",method=RequestMethod.POST)
	public Map<String,Object> registerUser(@RequestBody User user) {
		Map<String,Object> result = new HashMap<String, Object>();
		  result = userService.saveUser(user);
		return result;
	}
}
