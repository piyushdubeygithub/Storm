package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "COUNTRY_ID")
	   Long id;

	 @Column(name="LABEL")
		String label;
	 
	 @Column(name="STATUS")
		String status;
	 
	 @Column
		String createdAt;
	 
	 @Column
	    String updatedAt;
}
