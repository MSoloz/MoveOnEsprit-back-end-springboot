package com.esprit.tn.services;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.esprit.tn.models.Student;
import com.esprit.tn.repositories.IStudentRepository;


@Service
public class StudentService implements IStudentService{
	
	
	@Autowired
	private IStudentRepository studentRepository;
	
	

	@Override
	public Student createStudent(Student student, MultipartFile file) {
		
		 
		 String fileName = System.currentTimeMillis()+file.getOriginalFilename();
		 
		
		 try {
			 
	
			 
		//	 fileName.substring(start, end)
			 
			 
			  //  String pathDirectory = new ClassPathResource("\\static\\image\\").getFile().getAbsolutePath();
	        	
				file.transferTo(new File("D:\\sts-bundle\\sts-3.8.4.RELEASE\\MoveOnEspritBackEnd\\src\\main\\resources\\static\\image\\"+fileName));
			    
			//  file.transferTo(new File(pathDirectory+file.getOriginalFilename()));
			    
				
			} catch (IllegalStateException | IOException e) {
				
				
				e.printStackTrace();
			}
			
			
			student.setImage(fileName);
			
			return studentRepository.save(student);
			
		
		
	}

	@Override
	public Student login(Student student) {
		
		
		     String Email = student.getEmail();
			
			String Password = student.getPassword();
			
			
			return studentRepository.findStudentByEmailAndPassword(Email, Password);
			
			
	
		
	}

	@Override
	public Student getStudentById(String id) {
		
		
		return studentRepository.findById(id).orElse(null);
		
		
	}

	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
