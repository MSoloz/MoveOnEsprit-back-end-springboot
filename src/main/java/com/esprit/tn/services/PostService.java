package com.esprit.tn.services;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.esprit.tn.models.Post;
import com.esprit.tn.repositories.IPostRepository;

@Service
public class PostService implements IPostService{
	
	
	@Autowired
	private IPostRepository postRepository;
	

	@Override
	public Post createPost(Post post, MultipartFile file) {
		
		
		 
		 String fileName = System.currentTimeMillis()+file.getOriginalFilename();
		
		
		 try {
	        	
				file.transferTo(new File("D:\\sts-bundle\\sts-3.8.4.RELEASE\\MoveOnEspritBackEnd\\src\\main\\resources\\static\\image\\"+fileName));
				
			} catch (IllegalStateException | IOException e) {
				
				
				e.printStackTrace();
			}
			
			
			post.setImage(fileName);
			
			return postRepository.save(post);
			
		
	}

	@Override
	public List<Post> getPosts() {
		
		return postRepository.findAll();
		
	}

	@Override
	public Post getPostById(String id) {
		
		return postRepository.findById(id).orElse(null);
	}

	@Override
	public void deletePostById(String id) {

        postRepository.deleteById(id);
		
	}

	
	@Override
	public Post updatePostById(String id, Post post, MultipartFile file) {
	

		Post  postData = postRepository.findById(id).orElse(null);
		
		 String fileName = System.currentTimeMillis()+file.getOriginalFilename();
			
		 try {
	        	
				file.transferTo(new File("D:\\sts-bundle\\sts-3.8.4.RELEASE\\MoveOnEspritBackEnd\\src\\main\\resources\\static\\image\\"+fileName));
				
			} catch (IllegalStateException | IOException e) {
				
				
				e.printStackTrace();
			}
			
		 
		postData.setCreator(post.getCreator());
		
		postData.setDescription(post.getDescription());
		
		postData.setImage(fileName);

		return postRepository.save(postData);
	}

}
