package com.example.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa.entity.lmt_feature;

public interface lmt_featureRepository extends CrudRepository<lmt_feature, Long> {

	List<lmt_feature> findByFeature(String feature);
	
	List<lmt_feature> findByApplication(String application);
	
	
	
}
