package com.esprit.tn.controllers;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.esprit.tn.models.Post;
import com.esprit.tn.services.IPostService;

@RestController
@RequestMapping("/post")
public class PostController {
	
	
	@Autowired
	private IPostService postService;

	
	
	@PostMapping("/create")
    public Post createPost(Post post,@RequestParam("file") MultipartFile file){
    	
    	return postService.createPost(post, file);
    	
    }
	
	
	 @GetMapping("/all")
	 public List<Post> getPosts(){
		 
		 return postService.getPosts();
		 
	 }
	 
	 
	 @GetMapping("/details/{id}")
	 public Post getPostById(@PathVariable("id") String id){
		 
		 return postService.getPostById(id);
		 
	 }
	 
	 
	 @DeleteMapping("/delete/{id}")
	 public void deletePostById(@PathVariable("id") String id){
		 
		 postService.deletePostById(id);
		 
	 }
	 

		@PutMapping("/update/{id}")
		public Post updatePostById(@PathVariable("id") String id,Post post,@RequestParam("file") MultipartFile file) {
			
			return  postService.updatePostById(id, post, file);
			
		}

	
	

}
