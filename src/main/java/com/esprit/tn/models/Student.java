package com.esprit.tn.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document("students")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
	
	
	@Id
	private String id;
	
	private String firstName;
	
    private String lastName;
    
    private String identifier;
    
    private String cin;
    
    private String email;
    
    private String password;
    
    private String phone;
    
    private String image;
    
    private String sex;
    
    private Date dateOfBirth;
    
    private String studyCycle;
    
    private String studyProgram;
    
    private String studentClass;
	
	

}
