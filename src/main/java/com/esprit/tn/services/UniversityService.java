package com.esprit.tn.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.tn.models.University;
import com.esprit.tn.repositories.IUniversityRepository;


@Service
public class UniversityService implements IUniversityService{
	
	
	@Autowired
	private IUniversityRepository universityRepository;
	

	@Override
	public University createUniversity(University university, MultipartFile file) {
		
		
		 
		 String fileName = System.currentTimeMillis()+file.getOriginalFilename();
		
		 try {
	        	
				file.transferTo(new File("D:\\sts-bundle\\sts-3.8.4.RELEASE\\MoveOnEspritBackEnd\\src\\main\\resources\\static\\image\\"+fileName));
				
			} catch (IllegalStateException | IOException e) {
				
				
				e.printStackTrace();
			}
			
			
			university.setImage(fileName);
			
			return universityRepository.save(university);
			
			
		
	}

	@Override
	public List<University> getAllUniversities() {
		
		return universityRepository.findAll();
	}

	@Override
	public University getUniversityById(String id) {
	
		
		return universityRepository.findById(id).orElse(null);
		
	}

	@Override
	public void deleteUniversityById(String id) {
		
		universityRepository.deleteById(id);
		
	}

	@Override
	public University updateUniversity(String id,University university, MultipartFile file) {
		
		
		University university2 = universityRepository.findById(id).orElse(null);
		
		 String fileName = System.currentTimeMillis()+file.getOriginalFilename();
			
		 try {
	        	
				file.transferTo(new File("D:\\sts-bundle\\sts-3.8.4.RELEASE\\MoveOnEspritBackEnd\\src\\main\\resources\\static\\image\\"+fileName));
				
			} catch (IllegalStateException | IOException e) {
				
				
				e.printStackTrace();
			}
			
		
		
		university2.setName(university.getName());
		university2.setCountry(university.getCountry());
		university2.setAddress(university.getAddress());
		university2.setEmail(university.getEmail());
		university2.setPhone(university.getPhone());
		university2.setStartDate(university.getStartDate());
		university2.setEndDate(university.getEndDate());
		university2.setShown(university.getShown());
		university2.setContactPerson(university.getContactPerson());
		
	    university2.setImage(fileName);

		
		return universityRepository.save(university2);
	}


	
}
