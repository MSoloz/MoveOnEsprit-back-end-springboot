package com.esprit.tn.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.tn.models.Candidate;
import com.esprit.tn.models.Student;
import com.esprit.tn.models.University;
import com.esprit.tn.repositories.ICandidateRepository;
import com.esprit.tn.repositories.IStudentRepository;
import com.esprit.tn.repositories.IUniversityRepository;
import com.esprit.tn.services.ICandidateService;


@RestController
@RequestMapping("/candidate")
public class CandidateController {

	
	
	@Autowired
	private ICandidateService candidateService;
	
	
	@Autowired
	private IStudentRepository studentRepository;
	
	
	@Autowired
	private IUniversityRepository universityRepository;
	
	@Autowired
	private ICandidateRepository candidateRepository;
	
	
	@PostMapping("/create/{idu}/{ids}")
	 public Candidate createCandidate(@PathVariable("idu") String idu,@PathVariable("ids") String ids){
		
		
		Student student = studentRepository.findById(ids).orElse(null);
		
		University university = universityRepository.findById(idu).orElse(null);
		
		
		Candidate candidate = new Candidate();
		
		candidate.setStudent(student);
		
		candidate.setUniversity(university);
		
	 
	   return candidateRepository.save(candidate);

		
	 }
		
	
	  @GetMapping("/all")
	  List<Candidate> getAllCandidates(){
		  
		  return candidateService.getAllCandidates();
		  
	  }
		 
	  
	  @GetMapping("/details/{id}")
	  Candidate getCandidateById(@PathVariable("id") String id){
		  
		  return candidateService.getCandidateById(id);
		  
	  }
	  

		
	    @GetMapping("/admis")
		public List<Candidate> getAllAdmis() {
			
			return candidateService.getAllAdmis();
		}
		
}
