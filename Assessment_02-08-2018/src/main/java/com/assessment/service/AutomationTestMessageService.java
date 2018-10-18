package com.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.model.Message;
import com.assessment.model.TotalInformation;
import com.assessment.util.AppConstants;

@Service
public class AutomationTestMessageService {
	
	private TotalInformation totalInformation;
	private String answerColorGreen = "green-answer";
	private String answerColorYellow = "yellow-answer";
	private String answerColorRed = "red-answer";
	private String categoryTools = "tools";
	private String categoryMethodology = "SDLC Methodology";
	private String categoryCoverage = "Test Coverage";
	private String categoryDefect = "Defect Detection";
	private String category = null;
	
	private List<Message> messages;
	
	public TotalInformation setReportMessage(TotalInformation totalInfo) {
		this.totalInformation = totalInfo;
		messages = new ArrayList<>();
		setToolsCategoryMessage();
		setMethodologyCategoryMessage();
		setCovergareCategoryMessage();
		setDefectCategoryMessage();		
		totalInformation.setMessages(messages);
		
		return totalInformation;
	}
		
	//Logic for Message_1 (1-5 questions)
	public void setToolsCategoryMessage() {
		category = categoryTools;
		
		List<String> tools = totalInformation.getQuestions().get(0).getAnswer();
		List<String> platform = totalInformation.getQuestions().get(2).getAnswer();
		List<String> coverage = totalInformation.getQuestions().get(3).getAnswer();
		List<String> developmentCycle = totalInformation.getQuestions().get(4).getAnswer();	
		List<String> framework = totalInformation.getQuestions().get(1).getAnswer();

		if (!tools.isEmpty()
				&& (tools.contains(AppConstants.QUESTION_1a_OPTION_1)
						|| tools.contains(AppConstants.QUESTION_1a_OPTION_2)
						|| tools.contains(AppConstants.QUESTION_1a_OPTION_4)
						|| tools.contains(AppConstants.QUESTION_1a_OPTION_5)
						|| totalInformation.getQuestions().get(0).isOption6())) {
			if (!framework.isEmpty()
					&& framework.contains(AppConstants.QUESTION_2a_OPTION_2)) {
				if (!platform.isEmpty() && (platform.contains(AppConstants.QUESTION_3a_OPTION_2) || platform.contains(AppConstants.QUESTION_3a_OPTION_4))) {
					if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
						if (!developmentCycle.isEmpty()) {							
							createMessage(AppConstants.MESSAGE_4, answerColorGreen);						
						}
					} else if (!coverage.isEmpty()
							&& (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
						if (!developmentCycle.isEmpty()) {
							createMessage(AppConstants.MESSAGE_2D, answerColorYellow);
						}
					} else if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
						if (!developmentCycle.isEmpty()) {
							createMessage(AppConstants.MESSAGE_1D, answerColorRed);
						}
					}
				} else if (!platform.isEmpty()
						&& (platform.contains(AppConstants.QUESTION_3a_OPTION_1) || platform.contains("Main Frame"))) {
					if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
						if (!developmentCycle.isEmpty()) {
							createMessage(AppConstants.MESSAGE_3B, answerColorYellow);
						}
					} else if (!coverage.isEmpty()
							&& (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
						if (!developmentCycle.isEmpty()) {
							createMessage(AppConstants.MESSAGE_2C, answerColorYellow);
						}
					} else if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
						if (!developmentCycle.isEmpty()) {
							createMessage(AppConstants.MESSAGE_1C, answerColorRed);
						}
					}
				}

			}else if(!framework.isEmpty() && (framework.contains(AppConstants.QUESTION_2a_OPTION_1) ||
					framework.contains("Both") ) ) {
				
				if(!platform.isEmpty() && ( platform.contains(AppConstants.QUESTION_3a_OPTION_2) || platform.contains(AppConstants.QUESTION_3a_OPTION_4))) {
					if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
						if(!developmentCycle.isEmpty() ) {
							createMessage(AppConstants.MESSAGE_7A, answerColorGreen);
						}
					} else if(!coverage.isEmpty() && (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
						if(!developmentCycle.isEmpty() ) {
							createMessage(AppConstants.MESSAGE_6A, answerColorYellow);
						}
					} else if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
						if(!developmentCycle.isEmpty() ) {
							createMessage(AppConstants.MESSAGE_5A, answerColorYellow);
						}
					} 
				}  else if(!platform.isEmpty() && ( platform.contains(AppConstants.QUESTION_3a_OPTION_1) || platform.contains("Main Frame"))) {
					if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
						if(!developmentCycle.isEmpty() ) {
							createMessage(AppConstants.MESSAGE_7A, answerColorGreen);
						}
					} else if(!coverage.isEmpty() && (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
						if(!developmentCycle.isEmpty() ) {
							createMessage(AppConstants.MESSAGE_6A, answerColorYellow);
						}
					} else if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
						if(!developmentCycle.isEmpty() ) {
							createMessage(AppConstants.MESSAGE_5A, answerColorYellow);
						}
					}	
				}
			}
		}else if (!tools.isEmpty() && (tools.contains(AppConstants.QUESTION_1a_OPTION_3) || totalInformation.getQuestions().get(0).isOption7())){
				if (!framework.isEmpty()
						&& framework.contains(AppConstants.QUESTION_2a_OPTION_2)) {
					if (!platform.isEmpty() && (platform.contains(AppConstants.QUESTION_3a_OPTION_2) || platform.contains(AppConstants.QUESTION_3a_OPTION_4))) {
						if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
							if (!developmentCycle.isEmpty()) {
								createMessage(AppConstants.MESSAGE_4, answerColorGreen);
							}
						} else if (!coverage.isEmpty()
								&& (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
							if (!developmentCycle.isEmpty()) {
								createMessage(AppConstants.MESSAGE_2B, answerColorYellow);
							}
						} else if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
							if (!developmentCycle.isEmpty()) {
								createMessage(AppConstants.MESSAGE_1B, answerColorRed);
							}
						}
					} else if (!platform.isEmpty()
							&& (platform.contains(AppConstants.QUESTION_3a_OPTION_1) || platform.contains(AppConstants.QUESTION_3a_OPTION_3))) {
						if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
							if (!developmentCycle.isEmpty()) {
								createMessage(AppConstants.MESSAGE_3A, answerColorYellow);
							}
						} else if (!coverage.isEmpty()
								&& (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
							if (!developmentCycle.isEmpty()) {
								createMessage(AppConstants.MESSAGE_2A, answerColorYellow);
							}
						} else if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
							if (!developmentCycle.isEmpty()) {
								createMessage(AppConstants.MESSAGE_1A, answerColorRed);
							}
						}
					
					}

				}else if(!framework.isEmpty() && (framework.contains(AppConstants.QUESTION_2a_OPTION_1) ||
						framework.contains("Both") ) ) {
					
					if(!platform.isEmpty() && ( platform.contains(AppConstants.QUESTION_3a_OPTION_2) || platform.contains(AppConstants.QUESTION_3a_OPTION_4))) {
						if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
							if(!developmentCycle.isEmpty() ) {
								createMessage(AppConstants.MESSAGE_7A, answerColorGreen);
							}
						} else if(!coverage.isEmpty() && (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
							if(!developmentCycle.isEmpty() ) {
								createMessage(AppConstants.MESSAGE_6C, answerColorYellow);
							}
						} else if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
							if(!developmentCycle.isEmpty() ) {
								createMessage(AppConstants.MESSAGE_5B, answerColorYellow);
							}
						} 
					}  else if(!platform.isEmpty() && ( platform.contains(AppConstants.QUESTION_3a_OPTION_1) || platform.contains(AppConstants.QUESTION_3a_OPTION_3))) {
						if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
							// Pending
							if(!developmentCycle.isEmpty() ) {
								createMessage(AppConstants.MESSAGE_7A, answerColorGreen);
							}
						} else if(!coverage.isEmpty() && (coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2))) {
							if(!developmentCycle.isEmpty() ) {
								createMessage(AppConstants.MESSAGE_6B, answerColorYellow);
							}
						} else if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_1)) {
							if(!developmentCycle.isEmpty() ) {
								createMessage(AppConstants.MESSAGE_5B, answerColorYellow);
							}
						}	
					}
				}						
			}
		
	}
	
	
	//Logic for Message_2 (5th & 6th questions)
	public void setMethodologyCategoryMessage() {
		category = categoryMethodology;
		
		List<String> developmentCycle = totalInformation.getQuestions().get(4).getAnswer();
		List<String> releaseCycle = totalInformation.getQuestions().get(5).getAnswer();

		if (!developmentCycle.isEmpty()
				&& (developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_1) || totalInformation.getQuestions().get(4).isOption6())) {
			if (!releaseCycle.isEmpty() && (releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_1))) {
				createMessage(AppConstants.MESSAGE_8, answerColorRed);
			} 
		}
			else if (!developmentCycle.isEmpty()
					&& (developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_2) || developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_3))) {
				if (!releaseCycle.isEmpty()
						&& (releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_3) || releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_4)
								|| totalInformation.getQuestions().get(5).isOption6())) {
					createMessage(AppConstants.MESSAGE_8, answerColorRed);
				}

			}
				if (!developmentCycle.isEmpty()
				&& (developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_1) || totalInformation.getQuestions().get(4).isOption6())) {
			if (!releaseCycle.isEmpty() && (releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_3) || releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_4)
					|| totalInformation.getQuestions().get(5).isOption6())) {
				createMessage(AppConstants.MESSAGE_9, answerColorYellow);
			}
				}else if (!developmentCycle.isEmpty()
					&& (developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_2) || developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_3))) {
				if (!releaseCycle.isEmpty() && releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_2)) {
					createMessage(AppConstants.MESSAGE_9, answerColorYellow);
				}
			}
		
		if (!developmentCycle.isEmpty() && (developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_2) || developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_3))) {
			if (!releaseCycle.isEmpty() && releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_10, answerColorGreen);
			} 
		}
		else if (!developmentCycle.isEmpty() && (developmentCycle.contains(AppConstants.QUESTION_5a_OPTION_1) || totalInformation.getQuestions().get(4).isOption6())) {
				if (!releaseCycle.isEmpty() && releaseCycle.contains(AppConstants.QUESTION_6a_OPTION_2)) {
					createMessage(AppConstants.MESSAGE_10, answerColorGreen);					
				}				
			}		
	}
	
	// Logic for Message_3 (4th & 7th Questions)	
	public void setCovergareCategoryMessage() {
		category = categoryCoverage;
		
		List<String> coverage = totalInformation.getQuestions().get(3).getAnswer();
		List<String> testers = totalInformation.getQuestions().get(6).getAnswer();
		
		if (!coverage.isEmpty() && (coverage.contains(AppConstants.QUESTION_4a_OPTION_1) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2) )) {
			if (!testers.isEmpty() && (testers.contains(AppConstants.QUESTION_7a_OPTION_1) || testers.contains(AppConstants.QUESTION_7a_OPTION_2))) {
				createMessage(AppConstants.MESSAGE_11, answerColorRed);
			} else if (!testers.isEmpty() && (testers.contains(AppConstants.QUESTION_7a_OPTION_3) || testers.contains(AppConstants.QUESTION_7a_OPTION_4))) {
				createMessage(AppConstants.MESSAGE_12A, answerColorYellow);
			}
			
		} else if (!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_3)) {
			if (!testers.isEmpty() && (testers.contains(AppConstants.QUESTION_7a_OPTION_1) || testers.contains(AppConstants.QUESTION_7a_OPTION_2))) {
				createMessage(AppConstants.MESSAGE_12B, answerColorYellow);
			} else if (!testers.isEmpty() && (testers.contains(AppConstants.QUESTION_7a_OPTION_3) || testers.contains(AppConstants.QUESTION_7a_OPTION_4))) {
				createMessage(AppConstants.MESSAGE_12A, answerColorYellow);
			}
			
		} else if(!coverage.isEmpty() && coverage.contains(AppConstants.QUESTION_4a_OPTION_4)) {
			if (!testers.isEmpty() && (testers.contains(AppConstants.QUESTION_7a_OPTION_1) || testers.contains(AppConstants.QUESTION_7a_OPTION_2))) {
				createMessage(AppConstants.MESSAGE_12B, answerColorYellow);
			} else if (!testers.isEmpty() && (testers.contains(AppConstants.QUESTION_7a_OPTION_3) || testers.contains(AppConstants.QUESTION_7a_OPTION_4))) {
				createMessage(AppConstants.MESSAGE_13, answerColorGreen);
			}
		}			
		
	}
		
	//Logic for Message_4(4th & 8th Questions)
	public void setDefectCategoryMessage() {
		category = categoryDefect;
		
		List<String> coverage = totalInformation.getQuestions().get(3).getAnswer();
		List<String> productionDefects = totalInformation.getQuestions().get(7).getAnswer();
		
		if (!coverage.isEmpty() && (coverage.contains(AppConstants.QUESTION_4a_OPTION_1) || coverage.contains(AppConstants.QUESTION_4a_OPTION_2) || 
				coverage.contains(AppConstants.QUESTION_4a_OPTION_3) || coverage.contains(AppConstants.QUESTION_4a_OPTION_4))) {
			if (!productionDefects.isEmpty() && productionDefects.contains(AppConstants.QUESTION_8a_OPTION_1)) {
				createMessage(AppConstants.MESSAGE_14, answerColorRed);			
			} else if (!productionDefects.isEmpty() && (productionDefects.contains(AppConstants.QUESTION_8a_OPTION_2) || productionDefects.contains(AppConstants.QUESTION_8a_OPTION_3))) {
				createMessage(AppConstants.MESSAGE_15, answerColorYellow);
			} 		
		} else if (!coverage.isEmpty()) {
			if (!productionDefects.isEmpty() && productionDefects.contains(AppConstants.QUESTION_8a_OPTION_4)) {
				createMessage(AppConstants.MESSAGE_16, answerColorGreen);				
			}
		}
		
	}
	
	private void createMessage(String message, String color) {
		Message messageObj = new Message();
		messageObj.setMessage(message);
		messageObj.setColor(color);
		messageObj.setCategory(category);
		messages.add(messageObj);
	}
	
}
