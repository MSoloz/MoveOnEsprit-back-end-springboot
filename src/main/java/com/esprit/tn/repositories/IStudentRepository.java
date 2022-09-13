package com.esprit.tn.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.esprit.tn.models.Student;


public interface IStudentRepository extends MongoRepository<Student, String>{
	
	  public Student findStudentByEmailAndPassword(String email,String password);

}
