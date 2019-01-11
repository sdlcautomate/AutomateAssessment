package com.assessment.service;

import java.io.File;
import java.net.URL;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.model.PersonalDetails;

@Service
public class EmailNotificationService {


// Functionality for Sending the email with the pdf attachment
	public void sendEmailNotification(PersonalDetails userDetails,String fileName) {
		// Send Email
		final String username = "sdlcpartners7@gmail.com";

		final String password = "sdlcpartners@2018";

		Properties props = new Properties();

		props.put("mail.smtp.auth", "true");

		props.put("mail.smtp.starttls.enable", "true");

		props.put("mail.smtp.host", "smtp.gmail.com");

		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,

				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication(username, password);

					}

				});

		
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("sdlcpartners7@gmail.com"));

			message.setRecipients(Message.RecipientType.TO,

					InternetAddress.parse(userDetails.getEmail()));

			message.setSubject("Test Automation Sales Tool");
			BodyPart messageBodyPart = new MimeBodyPart();

			messageBodyPart.setText("This is a Test email");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			messageBodyPart = new MimeBodyPart();
			//File file = new File("html.pdf");
			//ClassLoader classLoader = getClass().getClassLoader();
			java.io.File file = new java.io.File("src/main/"+ fileName +".pdf");
			String filename = file.getAbsolutePath();
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName("AutomationReport.pdf");
			multipart.addBodyPart(messageBodyPart);
			messageBodyPart.setText("Signature");
			message.setContent(multipart);

			Transport.send(message);
			//file.delete();
			
			System.out.println("Mail sent succesfully!");

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
