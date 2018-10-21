package com.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.model.Message;
import com.assessment.model.TotalInformation;
import com.assessment.util.AppConstants;

@Service
public class ManualTestMessageService {
	
	private TotalInformation totalInformation;
	private String categoryTools = "Tools";
	private String categoryRoi = "ROI";
	private String categoryResource = "Resource";
	
	private String category = null;
	private List<Message> messages;
	
	public TotalInformation setReportMessage(TotalInformation totalInfo) {
		this.totalInformation = totalInfo;
		messages = new ArrayList<>();
		setToolsCategoryMessage();
		setRoiCategoryMessage();
		setResourceCategoryMessage();		
		totalInformation.setMessages(messages);
		
		return totalInformation;
	}
	
	private void setToolsCategoryMessage() {
		category = categoryTools;
		
		List<String> tools = totalInformation.getQuestions().get(2).getAnswer();
		List<String> platform = totalInformation.getQuestions().get(5).getAnswer();
		List<String> hardwareUsed = totalInformation.getQuestions().get(7).getAnswer();
		List<String> enterprieTools = totalInformation.getQuestions().get(3).getAnswer();
		
		if(!tools.isEmpty() && !platform.isEmpty()) {
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_1) && tools.contains(AppConstants.QUESTION_3b_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_20);
			}
			
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_1) && tools.contains(AppConstants.QUESTION_3b_OPTION_2)) {
				createMessage(AppConstants.MESSAGE_21);
			}
				
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_2) && tools.contains(AppConstants.QUESTION_3b_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_22);
			}
			
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_2) && tools.contains(AppConstants.QUESTION_3b_OPTION_2)) {
				createMessage(AppConstants.MESSAGE_23);
			}
			
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_3) && tools.contains(AppConstants.QUESTION_3b_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_24);
			}
			
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_3) && tools.contains(AppConstants.QUESTION_3b_OPTION_2)) {
				createMessage(AppConstants.MESSAGE_25);
			}
			
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_4) && tools.contains(AppConstants.QUESTION_3b_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_26);
			}
			
			if(platform.contains(AppConstants.QUESTION_6b_OPTION_4) && tools.contains(AppConstants.QUESTION_3b_OPTION_2)) {
				createMessage(AppConstants.MESSAGE_27);
			}
		}
		
		if(!hardwareUsed.isEmpty() && (hardwareUsed.contains(AppConstants.QUESTION_8b_OPTION_1) || hardwareUsed.contains(AppConstants.QUESTION_8b_OPTION_2)
					|| hardwareUsed.contains(AppConstants.QUESTION_8b_OPTION_3) || hardwareUsed.contains(AppConstants.QUESTION_8b_OPTION_4))) {
			createMessage(AppConstants.MESSAGE_28);
		}
		
		if(!enterprieTools.isEmpty() && (enterprieTools.contains(AppConstants.QUESTION_4b_OPTION_1) || enterprieTools.contains(AppConstants.QUESTION_4b_OPTION_2)
				|| enterprieTools.contains(AppConstants.QUESTION_4b_OPTION_3) || enterprieTools.contains(AppConstants.QUESTION_4b_OPTION_4))) {
			createMessage(AppConstants.MESSAGE_29);
		}
		
	}
	
	private void setRoiCategoryMessage() {
		category = categoryRoi;
		
		List<String> methodology = totalInformation.getQuestions().get(0).getAnswer();
		List<String> skills = totalInformation.getQuestions().get(9).getAnswer();
		
		if(!methodology.isEmpty() && !skills.isEmpty()) {
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_1) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_1) || skills.contains(AppConstants.QUESTION_10b_OPTION_3))) {
				createMessage(AppConstants.MESSAGE_30);
			}
			
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_1) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_2) || skills.contains(AppConstants.QUESTION_10b_OPTION_4))) {
				createMessage(AppConstants.MESSAGE_31);
			}
			
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_2) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_1) || skills.contains(AppConstants.QUESTION_10b_OPTION_3))) {
				createMessage(AppConstants.MESSAGE_32);
			}
			
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_2) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_2) || skills.contains(AppConstants.QUESTION_10b_OPTION_4))) {
				createMessage(AppConstants.MESSAGE_33);
			}
			
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_3) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_1) || skills.contains(AppConstants.QUESTION_10b_OPTION_3))) {
				createMessage(AppConstants.MESSAGE_34);
			}
			
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_3) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_2) || skills.contains(AppConstants.QUESTION_10b_OPTION_4))) {
				createMessage(AppConstants.MESSAGE_35);
			}
			//TODO: Other option might have saved the user entered string
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_4) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_1) || skills.contains(AppConstants.QUESTION_10b_OPTION_3))) {
				createMessage(AppConstants.MESSAGE_36);
			}
			
			if(methodology.contains(AppConstants.QUESTION_1b_OPTION_4) && 
					(skills.contains(AppConstants.QUESTION_10b_OPTION_2) || skills.contains(AppConstants.QUESTION_10b_OPTION_4))) {
				createMessage(AppConstants.MESSAGE_37);
			}
		}
	}
	
	private void setResourceCategoryMessage() {
		category = categoryResource;
		
		List<String> testingService = totalInformation.getQuestions().get(8).getAnswer();
		List<String> skills = totalInformation.getQuestions().get(9).getAnswer();
		
		if(!testingService.isEmpty()) {
			if(testingService.contains(AppConstants.QUESTION_9b_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_38);
			}
		
			if(testingService.contains(AppConstants.QUESTION_9b_OPTION_2)) {
				createMessage(AppConstants.MESSAGE_39);
			}
		}
		
		if(!skills.isEmpty()) {
			if(skills.contains(AppConstants.QUESTION_10b_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_40);
			}
		
			if(skills.contains(AppConstants.QUESTION_10b_OPTION_2)) {
				createMessage(AppConstants.MESSAGE_41);
			}
		}
	}
	
	private void createMessage(String message) {
		Message messageObj = new Message();
		messageObj.setMessage(message);
		messageObj.setCategory(category);
		messages.add(messageObj);
	}
}
