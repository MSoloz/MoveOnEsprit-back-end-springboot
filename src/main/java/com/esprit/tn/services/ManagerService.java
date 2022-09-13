package com.esprit.tn.services;

import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.esprit.tn.models.Manager;
import com.esprit.tn.repositories.IManagerRepository;





@Service
public class ManagerService implements IManagerService{   
	
	
	
	@Autowired
	private IManagerRepository managerRepository;
	
	
	@Override
	public Manager createManager(Manager manager, MultipartFile file) {
		
		 
		 String fileName = System.currentTimeMillis()+file.getOriginalFilename();
		
        try {
        	
			file.transferTo(new File("D:\\sts-bundle\\sts-3.8.4.RELEASE\\MoveOnEspritBackEnd\\src\\main\\resources\\static\\image\\"+fileName));
			
		} catch (IllegalStateException | IOException e) {
			
			
			e.printStackTrace();
		}
		
		
		manager.setImage(fileName);
		
		return managerRepository.save(manager);
		
		
	}

	
	@Override
	public Manager login(Manager manager) {
		
        String Email = manager.getEmail();
		
		String Password = manager.getPassword();
		
		
		return managerRepository.findManagerByEmailAndPassword(Email, Password);
		
		
		
	}

	

	@Override
	public Manager getManagerById(String id) {
	
		return managerRepository.findById(id).orElse(null);
			
	}



	@Override
	public Manager updateManagerById(String id, Manager manager, MultipartFile file) {
		

		Manager managerData = managerRepository.findById(id).orElse(null);
		
		 String fileName = System.currentTimeMillis()+file.getOriginalFilename();
			
		 try {
	        	
				file.transferTo(new File("D:\\sts-bundle\\sts-3.8.4.RELEASE\\MoveOnEspritBackEnd\\src\\main\\resources\\static\\image\\"+fileName));
				
			} catch (IllegalStateException | IOException e) {
				
				
				e.printStackTrace();
			}
			
		
		managerData.setFirstName(manager.getFirstName());
		managerData.setLastName(manager.getLastName());
		managerData.setEmail(manager.getEmail());
		managerData.setPhone(manager.getPhone());
		managerData.setPassword(manager.getPassword());
		managerData.setDescription(manager.getDescription());
		
		managerData.setImage(fileName);
	
		return managerRepository.save(managerData);
	}

}
