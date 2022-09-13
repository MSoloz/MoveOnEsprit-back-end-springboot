package com.esprit.tn.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.esprit.tn.models.Candidate;


public interface ICandidateRepository extends MongoRepository<Candidate, String>{
	
	@Query("{ 'applied' : true }")
	List<Candidate> findCandidatesByApplied();

}
