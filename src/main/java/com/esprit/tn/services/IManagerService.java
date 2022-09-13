package com.esprit.tn.services;


import org.springframework.web.multipart.MultipartFile;

import com.esprit.tn.models.Manager;

public interface IManagerService {


	Manager createManager(Manager manager, MultipartFile file);
	
	Manager login(Manager manager);
	
	Manager getManagerById(String id);
	
	Manager updateManagerById(String id,Manager manager,MultipartFile file);
	
	
}
