package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
	UserRepository userRepository;
    
    public Map<String,Object> saveUser(User user){
    	Map<String,Object> result = new HashMap<String, Object>();
    	user = userRepository.save(user);
    	result.put("user", user);
    	return result;
    }
    
    public boolean isUserExists(User user) {
		boolean userExists = userRepository.exists(user.getId());
		if(!userExists) {
			User user1 = userRepository.findByEmailId(user.getEmailId());
			if(user1 != null) {
				userExists = true;
			}
		}
		return userExists;
	}
}
