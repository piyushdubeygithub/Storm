package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "STATE_ID")
	   Long id;
	  
	  @ManyToOne
	  Country country;
	  
	  @Column(name="LABEL")
		String label;
	 
	 @Column(name="STATUS")
		String status;
}
