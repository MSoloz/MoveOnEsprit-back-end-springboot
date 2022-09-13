package com.esprit.tn.services;

import java.util.List;

import com.esprit.tn.models.Notification;




public interface INotificationService {
	
	
	  Notification createNotification(Notification notication);
	  
	 List<Notification> getNotificationsByUserId(String id);
		
}
