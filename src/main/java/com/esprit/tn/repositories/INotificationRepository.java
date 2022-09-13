package com.esprit.tn.repositories;




import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.esprit.tn.models.Notification;


public interface INotificationRepository extends MongoRepository<Notification, String>{

	@Query("{ 'receiverId' : ?0 }")
	List<Notification> findNotificationsByReceiverId(String id);
	
}
