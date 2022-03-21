package com.example.jpa.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa.entity.lmt_ut;

public interface lmt_utRepository extends CrudRepository<lmt_ut, Long> {

	List<lmt_ut> findByFeature(String feature);
	
	List<lmt_ut> findByTotal(int total);
	
	List<lmt_ut> findByUse(int use);
	
	List<lmt_ut> findByUt(int ut);
	
	List<lmt_ut> findByTimestamp(Timestamp timestamp);
	
	
	
}
