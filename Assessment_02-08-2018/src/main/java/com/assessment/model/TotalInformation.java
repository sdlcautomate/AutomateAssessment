package com.assessment.model;

import java.util.List;

import lombok.Data;


public class TotalInformation {

	private PersonalDetails personalDetails;
	private List<Questions> questions;
	private List<Message> messages;
	
	
	
	
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}




	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}




	public List<Questions> getQuestions() {
		return questions;
	}




	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}




	public List<Message> getMessages() {
		return messages;
	}




	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}




	@Override
	public String toString() {
		return "TotalInformation [personalDetails=" + personalDetails + ", questions=" + questions + "]";
	}		
	
}
