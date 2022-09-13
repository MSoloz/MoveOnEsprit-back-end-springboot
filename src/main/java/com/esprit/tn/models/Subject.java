package com.esprit.tn.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document("subjects")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Subject {
	
	
	@Id
	private String id;
	
	private String studentId;
	
    private String name;
    
    private float score;
    
    private String Module;
	
	

}
