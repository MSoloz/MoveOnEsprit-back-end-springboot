package com.esprit.tn.controllers;


import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.tn.models.University;

import com.esprit.tn.services.IUniversityService;

@RestController
@RequestMapping("/university")
public class UniversityController implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IUniversityService universityService;
  
	
	

	
	@PostMapping("/create")
	public University createUniversity(University university,@RequestParam("file") MultipartFile file){
		
		return universityService.createUniversity(university, file);
		
		
	}
	
	
	 @GetMapping("/all")
     public List<University> getAllUniversities(){
    	 
    	 return universityService.getAllUniversities();
    	
     }
	
	 
	
	@GetMapping("/details/{id}") 
	public University getUniversityById(@PathVariable("id") String id){
		
		return universityService.getUniversityById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteUniversityById(@PathVariable("id") String id){
		
		 universityService.deleteUniversityById(id);
		
	}
	
	
	
	@PutMapping("/update/{id}")
	public University updateUniversity(@PathVariable("id") String id,University university,@RequestParam("file") MultipartFile file) {
		
		return universityService.updateUniversity(id, university, file);
		
	}

	
	
	
	
	
	
	
	
	
	
}
