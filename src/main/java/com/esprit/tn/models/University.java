package com.esprit.tn.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document("universities")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class University {
	
	
	@Id
	private String id;
	
	private String name ;
	
    private String image;
    
    private String description;
    
    private String country;
    
    private String address;
    
    private Date startDate;
    
    private Date endDate;
    
    private String contactPerson;
    
    private String email; 
    
    private String phone;
    
    private Boolean shown = false;
    

}
