package com.esprit.tn.services;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.esprit.tn.models.Post;

public interface IPostService {
	
	
     Post createPost(Post post, MultipartFile file);
	
	 List<Post> getPosts();
	 
	 Post getPostById(String id);
	 
	 void deletePostById(String id);
	 
	 Post updatePostById(String id,Post post,MultipartFile file);
	

}
