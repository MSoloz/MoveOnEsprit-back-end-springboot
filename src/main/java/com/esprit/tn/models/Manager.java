package com.esprit.tn.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document("managers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Manager {

	@Id
	private String id;
	
	private String firstName;
	
    private String lastName;
    
    private String email;
    
    private String phone;
    
    private String password;
    
    private String description;
    
	private String image;
	
	
	
	
	
}
