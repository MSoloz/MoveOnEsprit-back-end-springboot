package com.esprit.tn.services;

import java.util.List;




import com.esprit.tn.models.Candidate;

public interface ICandidateService {
	
	  Candidate createCandidate(Candidate candidate);
		
	  List<Candidate> getAllCandidates();
		 
	  Candidate getCandidateById(String id);
	  
	  List<Candidate> getAllAdmis();

}
