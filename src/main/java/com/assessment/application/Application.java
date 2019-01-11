package com.assessment.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@SpringBootApplication
@ComponentScan("com.assessment")
public class Application {
	
	 // Setting suffix and prefix to identify html pages
	 @Bean 
	    ServletContextTemplateResolver templateResolver(){ 
	        ServletContextTemplateResolver resolver=new ServletContextTemplateResolver(); 
	        resolver.setSuffix(".html"); 
	        resolver.setPrefix("/WEB-INF/view/"); 
	        resolver.setTemplateMode("HTML5"); 
	        return resolver; 
	    } 

	// Spring Application launch
	public static void main(String[] args) {
		
	    SpringApplication.run(Application.class, args);

			}

}