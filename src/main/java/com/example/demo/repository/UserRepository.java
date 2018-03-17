package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{
	 public User findByEmailId(String emailId);
	 public User findByPhone(String phone);
	 public List<User> findByPhoneOrEmailId( String lastname, String firstname);
}
