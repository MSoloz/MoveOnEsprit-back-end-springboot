package com.esprit.tn.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		
		String path = "file:///D:/sts-bundle/sts-3.8.4.RELEASE/MoveOnEspritBackEnd/src/main/resources/static/image/";
		
        registry.addResourceHandler("/img/**")
                .addResourceLocations(path);	
    }

}
