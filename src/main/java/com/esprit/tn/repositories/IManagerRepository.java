package com.esprit.tn.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.esprit.tn.models.Manager;


public interface IManagerRepository extends MongoRepository<Manager, String>{
	
	
	  public Manager findManagerByEmailAndPassword(String email,String password);

}
