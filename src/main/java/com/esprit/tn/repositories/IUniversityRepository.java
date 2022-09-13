package com.esprit.tn.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.esprit.tn.models.University;

public interface IUniversityRepository extends MongoRepository<University, String>{

}
