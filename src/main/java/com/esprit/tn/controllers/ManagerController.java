package com.esprit.tn.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.esprit.tn.models.Manager;
import com.esprit.tn.services.IManagerService;


@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	
	
	@Autowired
	private IManagerService managerService;
	
	

	
	
	@PostMapping("/create")
    private Manager createManager(Manager manager,@RequestParam("file") MultipartFile file) {
		
		return managerService.createManager(manager, file);
		
	}
	
	
	@PostMapping("/login")
	private Manager login(@RequestBody Manager manager){
		
		return managerService.login(manager);
		
	}
	
	
	
	@GetMapping("/details/{id}")
	private Manager getManagerById(@PathVariable("id") String id){

		return managerService.getManagerById(id);
	}
	

	@PutMapping("/update/{id}")
	public Manager updateManagerById(@PathVariable("id") String id,Manager manager,@RequestParam("file") MultipartFile file) {
		
		return managerService.updateManagerById(id, manager, file);
		
	}

	
	

}
