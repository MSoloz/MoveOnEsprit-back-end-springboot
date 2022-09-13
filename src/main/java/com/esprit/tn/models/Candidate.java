package com.esprit.tn.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document("candidates")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Candidate {
	



	@Id
	private String id;
	

	@DBRef
	private Student student;
	
	
	@DBRef
	private University university;
	
	
	private Boolean applied = false;
	
	

}
