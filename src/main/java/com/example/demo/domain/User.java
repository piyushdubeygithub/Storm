package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	  @Id
		Long id;
	    @Column
		String name;
	    @Column
		String emailId;
	    @Column
		String password;
	    @Column
		String phone;
	    @Column
	    String type;
	    @Column
	    String status;
	    @Column
	    String createdAt;
	    @Column
	    String updatedAt;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
		public String getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
	    
}
