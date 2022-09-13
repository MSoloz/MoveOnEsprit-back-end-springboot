package com.esprit.tn.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.tn.models.Candidate;
import com.esprit.tn.repositories.ICandidateRepository;





@Service
public class CandidateService implements ICandidateService{
	
	
	
	@Autowired
	private ICandidateRepository iCandidateRepository;
	
	
	@Override
	public Candidate createCandidate(Candidate candidate) {
		
		return  iCandidateRepository.save(candidate);
	
		
	}

	@Override
	public List<Candidate> getAllCandidates() {
		
		return iCandidateRepository.findAll();
	}


	@Override
	public Candidate getCandidateById(String id) {
		
		return iCandidateRepository.findById(id).orElse(null);
	}

	
	
	@Override
	public List<Candidate> getAllAdmis() {
		
		return iCandidateRepository.findCandidatesByApplied();
	}
	
	
	

}
