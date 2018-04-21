package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.DrivingSchool;
import com.example.demo.dto.DrivingSchoolDTO;

public interface DrivingSchoolRepository extends JpaRepository<DrivingSchool, Serializable>{
	 @Query("select new com.example.demo.dto.DrivingSchoolDTO(u.name,l.label,c.label,ds.fees)"
	 		+ " from  DrivingSchool ds,Locality l, User u,City c,Suburb su"
	 		+ " where ds.user.id=u.id and l.id=ds.locality.id and "
	 		+ "su.id=l.suburb.id and c.id=su.city.id and l.label=:localityName ")
	 public List<DrivingSchoolDTO> findByLocality(@Param(value = "localityName") String localityName);
	 
	 @Query("select new com.example.demo.dto.DrivingSchoolDTO(u.name,l.label,c.label,ds.fees)"
		 		+ " from  DrivingSchool ds,Locality l, User u,City c,Suburb su"
		 		+ " where ds.user.id=u.id and l.id=ds.locality.id and "
		 		+ "su.id=l.suburb.id and c.id=su.city.id and c.label='Gurgaon' ")
	 public List<DrivingSchoolDTO> findByCity(@Param(value = "cityName") String cityName);
}
