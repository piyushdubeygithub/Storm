package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.utility.URLMapping;


@RestController
public class MainController {
	
	@Autowired
	UserService userService;
     @RequestMapping(value=URLMapping.REGISTER_USER,method=RequestMethod.POST)
	public Map<String,Object> registerUser(@RequestBody User user) {
		Map<String,Object> result = new HashMap<String, Object>();
		  result = userService.saveUser(user);
		return result;
	}
     
     @RequestMapping(value=URLMapping.UPDATE_USER,method=RequestMethod.PUT)
 	public Map<String,Object> updateUser(@RequestBody User user) {
 		Map<String,Object> result = new HashMap<String, Object>();
 		  result = userService.updateUser(user);
 		return result;
 	}
     
     @RequestMapping(value=URLMapping.LOGIN_USER,method=RequestMethod.POST)
     public Map<String,Object> loginUser(@RequestBody Map<String,Object> loginForm) {
    	 Map<String,Object> result = new HashMap<String,Object>();
    	 result = userService.loginUser(loginForm);
    	 return result;
     }
     
     @RequestMapping(value=URLMapping.SEARCH_DS,method=RequestMethod.GET)
     public Map<String,Object> searchDS(@RequestParam String keyword, @RequestParam String type) {
    	 Map<String,Object> result = new HashMap<String,Object>();
    	 result = userService.searchDS(keyword, type);
    	 return result;
     }
     
}
