package com.esprit.tn.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.esprit.tn.models.Post;

public interface IPostRepository extends MongoRepository<Post, String>{

}
