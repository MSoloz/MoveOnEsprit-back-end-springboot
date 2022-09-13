package com.esprit.tn.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.esprit.tn.models.Student;
import com.esprit.tn.services.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Autowired
	private IStudentService studentService;
	
   
	
	@PostMapping("/create")
    public Student createStudent(Student student,@RequestParam("file") MultipartFile file){
    	
    	return studentService.createStudent(student, file);
    	
    }
	
	
	@PostMapping("/login")
	public Student login(@RequestBody Student student){
		
		
		return studentService.login(student);
	}
	
	
	@GetMapping("/details/{id}")
	public Student getStudentById(@PathVariable("id") String id){
		
		return studentService.getStudentById(id);
		
	}
	
	
	
	
	
}
