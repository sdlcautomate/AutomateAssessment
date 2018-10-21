package com.assessment.application;

import java.io.File;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.assessment.model.PersonalDetails;

public class TestMail {
	public static void main(String[] args) {
		sendEmailNotification();
	}
	public static void sendEmailNotification(){
		// Send Email
		final String username = "sranjan@sdlcpartners.com";
		
		          final String password = "De@daccount7899";
		
		 
		
		        Properties props = new Properties();
		
		        props.put("mail.smtp.auth", "true");
		
		        props.put("mail.smtp.starttls.enable", "true");
		
		        props.put("mail.smtp.host", "smtp.office365.com");
		
		        props.put("mail.smtp.port", "587");
		
		 
		
		        Session session = Session.getInstance(props,
		
		                new javax.mail.Authenticator() {
		
		                    protected PasswordAuthentication getPasswordAuthentication() {
		
		                        return new PasswordAuthentication(username, password);
		
		                    }
		
		                });
		
		 

		//MimeMessage message = mailSender.createMimeMessage();
		//MimeMessageHelper helper;
		        Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("sranjan@sdlcpartners.com"));
			
			            message.setRecipients(Message.RecipientType.TO,
			
			                    InternetAddress.parse("deepakaitha7@gmail.com"));
			
			            message.setSubject("Message from SDLC");
			
			            message.setText("Hi," +
			
			                    "This is a Test mail for JCG Example!");

			//helper = new MimeMessageHelper(message, true);
			//helper.setTo(userDetails.getEmail());
		   // helper.setFrom("ranjansaurabh29@gmail.com");
		    //helper.setSubject("Email from SDLC");
		   //helper.setText("AutomationAssessment");
		    //URL url = getClass().getResource("Vcode_A2.pptx");
		    //File file = new File(url.getPath());	   
		    //helper.addAttachment("Invoice", file);
		    Transport.send(message);
		    File file = new File("Vcode_A2.pptx");
		    String path = file.getAbsolutePath();
		    System.out.println(path);
		    System.out.println("Mail sent succesfully!");

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	    
	}
}
