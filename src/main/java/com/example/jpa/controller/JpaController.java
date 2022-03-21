package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.lmt_feature;
import com.example.jpa.entity.lmt_ut;
import com.example.jpa.repository.lmt_featureRepository;
import com.example.jpa.repository.lmt_utRepository;

@RestController
public class JpaController {
 
	@Autowired
	lmt_featureRepository featurerepository;
	
	@Autowired
	lmt_utRepository lmt_utRepository;
	
	@GetMapping("/")
	public String getMainPage() {
		return "Test JPA Page";
	}
	
	@GetMapping("/lmt_feature_findAll")
	public String lmt_featurefindAll() {
		
		String result = "";
		
		for (lmt_feature lmt_feature : featurerepository.findAll()) {
			
			result += lmt_feature.toString() + "</br>";
			
		}
		
		return result;
		
	}
	
	@GetMapping("/lmt_feature_findByFeature")
	public String lmt_feature_findByFeature(@RequestParam("feature") String feature) {
		
		String result = "";
		
		for (lmt_feature lmt_feature : featurerepository.findByFeature(feature)) {
			
			result += lmt_feature.toString() + "</br>";
			
		}
		
		return result;
		
	}
	
	@GetMapping("/lmt_feature_findByApplication")
	public String findByApplication(@RequestParam("application") String application) {
		
		String result = "";
		
		for (lmt_feature lmt_feature : featurerepository.findByApplication(application)) {
			
			result += lmt_feature.toString() + "</br>";
			
		}
		
		return result;
		
	}
	
	@GetMapping("/lmt_ut_findAll")
	public String lmt_utfindAll() {
		
		String result = "";
		
		for (lmt_ut lmt_ut : lmt_utRepository.findAll()) {
			
			result += lmt_ut.toString() + "</br>";
			
		}
		
		return result;
		
	}
	
	@GetMapping("/lmt_ut_findByFeature")
	public String lmt_ut_findByFeature(@RequestParam("feature") String feature) {
		
		String result = "";
		
		for (lmt_ut lmt_ut : lmt_utRepository.findByFeature(feature)) {
			
			result += lmt_ut.toString() + "</br>";
			
		}
		
		return result;
		
	}
	
	@GetMapping("/lmt_ut_findByTotal")
	public String lmt_ut_findByTotal(@RequestParam("total") int total) {
		
		String result = "";
		
		for (lmt_ut lmt_ut : lmt_utRepository.findByTotal(total)) {
			
			result += lmt_ut.toString() + "</br>";
			System.out.println(lmt_ut.toString() +" 1");
		}
		
		//System.out.println(lmt_utRepository.findByTotal(15).toString());
		
		
		
		return result;
		
	}
	
	
	
}
