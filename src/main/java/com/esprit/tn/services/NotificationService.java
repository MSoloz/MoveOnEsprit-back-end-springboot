package com.esprit.tn.services;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.tn.models.Notification;
import com.esprit.tn.repositories.INotificationRepository;


@Service
public class NotificationService implements INotificationService{
	
	
	
	@Autowired
	private INotificationRepository notificationRepository;
	
	

	@Override
	public Notification createNotification(Notification notification) {
		
		return notificationRepository.save(notification);
	}



	@Override
	public List<Notification> getNotificationsByUserId(String id) {
		
		return notificationRepository.findNotificationsByReceiverId(id);
	}

}
