package com.esprit.tn.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


import com.esprit.tn.models.University;

public interface IUniversityService {
	
	

	University createUniversity(University university, MultipartFile file);
	
	List<University> getAllUniversities();
	
	University getUniversityById(String id);
	
	void deleteUniversityById(String id);
	
	University updateUniversity(String id,University university, MultipartFile file);
	



}
