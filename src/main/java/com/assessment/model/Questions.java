package com.assessment.model;

import java.util.List;

import lombok.Data;


public class Questions {

	public Questions () {
		System.out.println("XXX Questions ");
	}
	private String question;
	private List<String> answer;
	private List<String> answerOptions;
	private boolean option1;
	private boolean option2;
	private boolean option3;
	private boolean option4;
	private boolean option5;
	private boolean option6;
	private boolean option7;
	private String other1="";
	private String other2="";
	private String radio3;
	private String radio6;
	private String radio7;
	private String radio10;

	
	public String getRadio3() {
		return radio3;
	}




	public void setRadio3(String radio8) {
		this.radio3 = radio8;
	}



	public String getRadio6() {
		return radio6;
	}




	public void setRadio6(String radio6) {
		this.radio6 = radio6;
	}


	public String getRadio7() {
		return radio7;
	}


	public String getRadio10() {
		return radio10;
	}




	public void setRadio10(String radio8) {
		this.radio10 = radio8;
	}


	public void setRadio7(String radio7) {
		this.radio7 = radio7;
	}

		
	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public List<String> getAnswer() {
		return answer;
	}



	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}



	public List<String> getAnswerOptions() {
		return answerOptions;
	}



	public void setAnswerOptions(List<String> answerOptions) {
		this.answerOptions = answerOptions;
	}



	public boolean isOption1() {
		return option1;
	}



	public void setOption1(boolean option1) {
		System.out.println("Called option");
		this.option1 = option1;
	}



	public boolean isOption2() {
		return option2;
	}



	public void setOption2(boolean option2) {
		this.option2 = option2;
	}



	public boolean isOption3() {
		return option3;
	}



	public void setOption3(boolean option3) {
		this.option3 = option3;
	}



	public boolean isOption4() {
		return option4;
	}



	public void setOption4(boolean option4) {
		this.option4 = option4;
	}



	public boolean isOption5() {
		return option5;
	}



	public void setOption5(boolean option5) {
		this.option5 = option5;
	}



	public boolean isOption6() {
		return option6;
	}



	public void setOption6(boolean option6) {
		this.option6 = option6;
	}



	public boolean isOption7() {
		return option7;
	}



	public void setOption7(boolean option7) {
		this.option7 = option7;
	}



	public String getOther1() {
		return other1;
	}



	public void setOther1(String other1) {
		this.other1 = other1;
	}



	public String getOther2() {
		return other2;
	}



	public void setOther2(String other2) {
		this.other2 = other2;
	}



	@Override
	public String toString() {
		return "Questions [question=" + question + ", answer=" + answer + ", option1=" + option1 + ", option2="
				+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", option5=" + option5 + ", option6="
				+ option6 + ", option7=" + option7 + ", other1=" + other1 + ", other2=" + other2 + "]";
	}		
	
}
