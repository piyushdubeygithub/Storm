package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;


@RestController
public class MainController {
     @RequestMapping(value="/register/user",method=RequestMethod.POST)
	public Map<String,Object> registerUser(@RequestBody User user) {
		Map<String,Object> result = new HashMap<String, Object>();
		
		return result;
	}
}
