package com.esprit.tn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.tn.models.Notification;
import com.esprit.tn.services.INotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {


	@Autowired
	private INotificationService notificationService;
	
	

	@PostMapping("/create")
	public Notification createNotification(@RequestBody Notification notification) {
		
		return notificationService.createNotification(notification);
	}



	@GetMapping("/student/{id}")
	public List<Notification> getNotificationsByUserId(@PathVariable("id") String id) {
		
		return notificationService.getNotificationsByUserId(id);
	}

}
