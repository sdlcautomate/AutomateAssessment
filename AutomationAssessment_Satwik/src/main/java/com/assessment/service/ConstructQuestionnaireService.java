package com.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.model.Questions;
import com.assessment.model.TotalInformation;
import com.assessment.util.AppConstants;

@Service
public class ConstructQuestionnaireService {
	private List<Questions> questions;
	private List<String> answerOptions;
	private TotalInformation totalInformation;
	
	public TotalInformation getAutomationTestQuestionnaireDetails(TotalInformation totalInformation) {
		questions = new ArrayList<Questions>();
		this.totalInformation = totalInformation;
		
		addQuestionToList(AppConstants.QUESTION_1a);		
		addQuestionToList(AppConstants.QUESTION_2a);		
		addQuestionToList(AppConstants.QUESTION_3a);		
		addQuestionToList(AppConstants.QUESTION_4a);		
		addQuestionToList(AppConstants.QUESTION_5a);	
		addQuestionToList(AppConstants.QUESTION_6a);		
		addQuestionToList(AppConstants.QUESTION_7a);		
		addQuestionToList(AppConstants.QUESTION_8a);		
		addQuestionToList(AppConstants.QUESTION_9a);	
		addQuestionToList(AppConstants.QUESTION_10a);		
		totalInformation.setQuestions(questions);
		
		addQuestion1AnswerOptions(0);
		addQuestion2AnswerOptions(1);
		addQuestion3AnswerOptions(2);
		addQuestion4AnswerOptions(3);
		addQuestion5AnswerOptions(4);
		addQuestion6AnswerOptions(5);
		addQuestion7AnswerOptions(6);
		addQuestion8AnswerOptions(7);
		addQuestion9AnswerOptions(8);
		addQuestion10AnswerOptions(9);
		
		return totalInformation;
	}		
	
	public TotalInformation getManualTestQuestionnaireDetails(TotalInformation totalInformation) {
		questions = new ArrayList<Questions>();
		this.totalInformation = totalInformation;
		
		addQuestionToList(AppConstants.QUESTION_1b);		
		addQuestionToList(AppConstants.QUESTION_2b);		
		addQuestionToList(AppConstants.QUESTION_3b);
		addQuestionToList(AppConstants.QUESTION_4b);		
		addQuestionToList(AppConstants.QUESTION_5b);		
		addQuestionToList(AppConstants.QUESTION_6b);		
		addQuestionToList(AppConstants.QUESTION_7b);		
		addQuestionToList(AppConstants.QUESTION_8b);	
		addQuestionToList(AppConstants.QUESTION_9b);		
		addQuestionToList(AppConstants.QUESTION_10b);				
		totalInformation.setQuestions(questions);
		
		addQuestion5AnswerOptions(0);
		addQuestion11AnswerOptions(1);
		addQuestion12AnswerOptions(2);
		addQuestion9AnswerOptions(3);
		addQuestion6AnswerOptions(4);
		addQuestion3AnswerOptions(5);
		addQuestion10AnswerOptions(6);
		addQuestion13AnswerOptions(7);
		addQuestion14AnswerOptions(8);
		addQuestion15AnswerOptions(9);
		
		return totalInformation;
	}
	
	private void addQuestionToList(String questionToAdd) {
		Questions question = new Questions();
		question.setQuestion(questionToAdd);
		questions.add(question);
	}
	
	private void addQuestion1AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_1a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_1a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_1a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_1a_OPTION_4);
		answerOptions.add(AppConstants.QUESTION_1a_OPTION_5);
		answerOptions.add(AppConstants.QUESTION_1a_OPTION_6);
		answerOptions.add(AppConstants.QUESTION_1a_OPTION_7);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion2AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_2a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_2a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_2a_OPTION_3);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}

	private void addQuestion3AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_3a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_3a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_3a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_3a_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion4AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_4a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_4a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_4a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_4a_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion5AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_5a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_5a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_5a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_5a_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion6AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_6a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_6a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_6a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_6a_OPTION_4);
		answerOptions.add(AppConstants.QUESTION_6a_OPTION_5);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}

	private void addQuestion7AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_7a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_7a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_7a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_7a_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion8AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_8a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_8a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_8a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_8a_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion9AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_9a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_9a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_9a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_9a_OPTION_4);
		answerOptions.add(AppConstants.QUESTION_9a_OPTION_5);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion10AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_10a_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_10a_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_10a_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_10a_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion11AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_2b_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_2b_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_2b_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_2b_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion12AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_3b_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_3b_OPTION_2);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion13AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_8b_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_8b_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_8b_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_8b_OPTION_4);
		answerOptions.add(AppConstants.QUESTION_8b_OPTION_5);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion14AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_9b_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_9b_OPTION_2);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
	
	private void addQuestion15AnswerOptions(int index) {
		answerOptions = new ArrayList<String>();
		answerOptions.add(AppConstants.QUESTION_10b_OPTION_1);
		answerOptions.add(AppConstants.QUESTION_10b_OPTION_2);
		answerOptions.add(AppConstants.QUESTION_10b_OPTION_3);
		answerOptions.add(AppConstants.QUESTION_10b_OPTION_4);
		
		totalInformation.getQuestions().get(index).setAnswerOptions(answerOptions);
	}
}
