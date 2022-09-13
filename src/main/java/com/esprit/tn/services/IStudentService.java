package com.esprit.tn.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


import com.esprit.tn.models.Student;

public interface IStudentService {

	
    Student createStudent(Student student, MultipartFile file);
	
	Student login(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudentById(String id);
	
}
