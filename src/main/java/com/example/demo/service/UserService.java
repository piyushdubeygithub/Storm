package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.User;
import com.example.demo.repository.DrivingSchoolRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
	UserRepository userRepository;
    
    @Autowired
	DrivingSchoolRepository dsRepository;
    
    public Map<String,Object> saveUser(User user){
    	Map<String,Object> result = new HashMap<String, Object>();
    	if(!isUserExists(user)) {
    		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    		user.setCreatedAt(timeStamp);
    		user = userRepository.save(user);
        	result.put("user", user);
    	}else {
    		result.put("user", "user already registered");
    	}
    	return result;
    }
    
    public Map<String,Object> updateUser(User user){
    	Map<String,Object> result = new HashMap<String, Object>();
    	User user1 = userRepository.findOne(user.getId());
    	if(user1 != null) {
    		user.setCreatedAt(user1.getCreatedAt());
    		String phone = user.getPhone();
    		String emailId = user.getEmailId();
    		List<User> userList = userRepository.findByPhoneOrEmailId(phone, emailId);
    		if(userList.size()>0) {
        		result.put("Updated User", "Phone or emailId already exists");
        		return result;
    		}
    		userRepository.save(user);
    		result.put("Updated User", user);
    	}else {
    		result.put("Updated User", "user not found");
    	}
    	return result;
    }
    
    public Map<String,Object> loginUser(Map<String,Object> loginForm){
    	Map<String,Object> result = new HashMap<String,Object>();
    	String userName = (String) loginForm.get("userName");
    	String password = (String) loginForm.get("password");
		String passwordUser = null;

    	User user = userRepository.findByEmailId(userName);
    	if(user != null) {
    		 passwordUser = user.getPassword();
    		 if(passwordUser.equals(password)) {
    			 result.put("user", user);
    			 result.put("verified", "user verified");
    			 return result;
    		 }
    	}else {
    		user = userRepository.findByPhone(userName);
    		 if(user != null) {
    			 passwordUser = user.getPassword();
        		 if(passwordUser.equals(password)) {
        			 result.put("user", user);
        			 result.put("verified", "user verified");
        			 return result;
        		 }
    		 }
    	}
		 result.put("verified", "user not verified");
    	return result;
    }
    
    public boolean isUserExists(User user) {
		boolean userExists = false;
		if(!userExists) {
			User user1 = userRepository.findByEmailId(user.getEmailId());
			if(user1 != null) {
				userExists = true;
			}else {
				 user1 = userRepository.findByPhone(user.getPhone());
                 if(user1 != null) {
                	 userExists = true;
                 }
			}
		}
		return userExists;
	}

	public Map<String, Object> searchDS(String keyword, String type) {
		Map<String,Object> result = new HashMap<>();
		if(type.equals("locality")) {
			result.put("result", dsRepository.findByLocality(keyword));
		}else {
			result.put("result", dsRepository.findByCity(keyword));
		}
		return result;
	}
}
