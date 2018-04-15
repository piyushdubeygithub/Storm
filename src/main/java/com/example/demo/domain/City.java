package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "CITY_ID")
	   Long id;
	
	@Column(name="LABEL") 
	String label;
 
 @Column(name="STATUS")
	String status;
 
 @ManyToOne
 State state;

}
