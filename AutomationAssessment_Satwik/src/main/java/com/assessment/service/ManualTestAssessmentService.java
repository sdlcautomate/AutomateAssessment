package com.assessment.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.assessment.model.TotalInformation;
import com.assessment.util.AppConstants;

@Service
public class ManualTestAssessmentService {
	
	private final String selectdCheckBoxStatus = AppConstants.ON;
	
	public void setQuestion_1b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		List<String> list = new ArrayList<String>();
		
		resetOptions(totalInformation, 0);
		
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox100b"))) {
			totalInformation.getQuestions().get(0).setOption1(true);
			list.add(AppConstants.QUESTION_1b_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox101b"))) {
			totalInformation.getQuestions().get(0).setOption2(true);
			list.add(AppConstants.QUESTION_1b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox102b"))) {
			totalInformation.getQuestions().get(0).setOption3(true);
			list.add(AppConstants.QUESTION_1b_OPTION_3);
		}		
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox103b"))) {
			totalInformation.getQuestions().get(0).setOther1(httpRequest.getParameter("questions[0].other1"));
			totalInformation.getQuestions().get(0).setOption6(true);
			list.add(httpRequest.getParameter("questions[0].other1"));
		}	
		
		totalInformation.getQuestions().get(0).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_2b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		List<String> list = new ArrayList<String>();
		
		resetOptions(totalInformation, 1);
		
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox200b"))) {
			totalInformation.getQuestions().get(1).setOption1(true);
			list.add(AppConstants.QUESTION_2b_OPTION_1);			
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox201b"))) {
			totalInformation.getQuestions().get(1).setOption2(true);
			list.add(AppConstants.QUESTION_2b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox202b"))) {
			totalInformation.getQuestions().get(1).setOption3(true);
			list.add(AppConstants.QUESTION_2b_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox203b"))) {
			totalInformation.getQuestions().get(1).setOption3(true);
			list.add(AppConstants.QUESTION_2b_OPTION_4);
		}
		
		totalInformation.getQuestions().get(1).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_3b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		List<String> list = new ArrayList<String>();
		resetOptions(totalInformation, 2);
		
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox300b"))) {
			totalInformation.getQuestions().get(2).setOption1(true);
			list.add(AppConstants.QUESTION_3b_OPTION_1);			
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox301b"))) {
			totalInformation.getQuestions().get(2).setOption2(true);
			list.add(AppConstants.QUESTION_3b_OPTION_2);
		}
		
		totalInformation.getQuestions().get(2).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_4b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		List<String> list = new ArrayList<String>();
		
		resetOptions(totalInformation, 3);
		
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox400b"))) {
			totalInformation.getQuestions().get(3).setOption1(true);
			list.add(AppConstants.QUESTION_4b_OPTION_1);
			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox401b"))) {
			totalInformation.getQuestions().get(3).setOption2(true);
			list.add(AppConstants.QUESTION_4b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox402b"))) {
			totalInformation.getQuestions().get(3).setOption3(true);
			list.add(AppConstants.QUESTION_4b_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox403b"))) {
			totalInformation.getQuestions().get(3).setOption3(true);
			list.add(AppConstants.QUESTION_4b_OPTION_4);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox404b"))) {
			totalInformation.getQuestions().get(3).setOther1(httpRequest.getParameter("questions[3].other1"));
			totalInformation.getQuestions().get(3).setOption6(true);
			list.add(httpRequest.getParameter("questions[3].other1"));
		}	
		
		totalInformation.getQuestions().get(3).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_5b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 4);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox500b"))) {
			totalInformation.getQuestions().get(4).setOption1(true);
			list.add(AppConstants.QUESTION_5b_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox501b"))) {
			totalInformation.getQuestions().get(4).setOption2(true);
			list.add(AppConstants.QUESTION_5b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox502b"))) {
			totalInformation.getQuestions().get(4).setOption3(true);
			list.add(AppConstants.QUESTION_5b_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox503b"))) {
			totalInformation.getQuestions().get(4).setOption4(true);
			list.add(AppConstants.QUESTION_5b_OPTION_4);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox504b"))) {
			totalInformation.getQuestions().get(4).setOther1(httpRequest.getParameter("questions[4].other1"));
			totalInformation.getQuestions().get(4).setOption6(true);
			list.add(httpRequest.getParameter("questions[4].other1"));
		}

		totalInformation.getQuestions().get(4).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
		
	}
	
	public void setQuestion_6b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 5);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox600b"))) {
			totalInformation.getQuestions().get(5).setOption1(true);
			list.add(AppConstants.QUESTION_6b_OPTION_1);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox601b"))) {
			totalInformation.getQuestions().get(5).setOption2(true);
			list.add(AppConstants.QUESTION_6b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox602b"))) {
			totalInformation.getQuestions().get(5).setOption3(true);
			list.add(AppConstants.QUESTION_6b_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox603b"))) {
			totalInformation.getQuestions().get(5).setOption4(true);
			list.add(AppConstants.QUESTION_6b_OPTION_4);
		}
		totalInformation.getQuestions().get(5).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
		
	}
	
	public void setQuestion_7b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 6);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox700b"))) {
			totalInformation.getQuestions().get(6).setOption1(true);
			list.add(AppConstants.QUESTION_7b_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox701b"))) {
			totalInformation.getQuestions().get(6).setOption2(true);
			list.add(AppConstants.QUESTION_7b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox702b"))) {
			totalInformation.getQuestions().get(6).setOption3(true);
			list.add(AppConstants.QUESTION_7b_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox703b"))) {
			totalInformation.getQuestions().get(6).setOption4(true);
			list.add(AppConstants.QUESTION_7b_OPTION_4);
		}
		totalInformation.getQuestions().get(6).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_8b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 7);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox800b"))) {
			totalInformation.getQuestions().get(7).setOption1(true);
			list.add(AppConstants.QUESTION_8b_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox801b"))) {
			totalInformation.getQuestions().get(7).setOption2(true);
			list.add(AppConstants.QUESTION_8b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox802b"))) {
			totalInformation.getQuestions().get(7).setOption3(true);
			list.add(AppConstants.QUESTION_8b_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox803b"))) {
			totalInformation.getQuestions().get(7).setOption4(true);
			list.add(AppConstants.QUESTION_8b_OPTION_4);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox804b"))) {
			totalInformation.getQuestions().get(7).setOther1(httpRequest.getParameter("questions[7].other1"));
			totalInformation.getQuestions().get(7).setOption6(true);
			list.add(httpRequest.getParameter("questions[7].other1"));
		}
		totalInformation.getQuestions().get(7).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_9b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 8);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox900b"))) {
			totalInformation.getQuestions().get(8).setOption1(true);
			list.add(AppConstants.QUESTION_9b_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox901b"))) {
			totalInformation.getQuestions().get(8).setOption2(true);
			list.add(AppConstants.QUESTION_9b_OPTION_2);
		}

		totalInformation.getQuestions().get(8).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_10b(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 9);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1000b"))) {
			totalInformation.getQuestions().get(9).setOption1(true);
			list.add(AppConstants.QUESTION_10b_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1001b"))) {
			totalInformation.getQuestions().get(9).setOption2(true);
			list.add(AppConstants.QUESTION_10b_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1002b"))) {
			totalInformation.getQuestions().get(9).setOption3(true);
			list.add(AppConstants.QUESTION_10b_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1003b"))) {
			totalInformation.getQuestions().get(9).setOption4(true);
			list.add(AppConstants.QUESTION_10b_OPTION_4);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox106a"))) {
			totalInformation.getQuestions().get(0).setOther2(httpRequest.getParameter("questions[0].other2"));
			totalInformation.getQuestions().get(0).setOption7(true);
			list.add(httpRequest.getParameter("questions[0].other2"));
		}

		
		totalInformation.getQuestions().get(9).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	private void resetOptions(TotalInformation totalInformation, int position) {
		totalInformation.getQuestions().get(position).setOption1(false);
		totalInformation.getQuestions().get(position).setOption2(false);
		totalInformation.getQuestions().get(position).setOption3(false);
		totalInformation.getQuestions().get(position).setOption4(false);
		totalInformation.getQuestions().get(position).setOption5(false);
		totalInformation.getQuestions().get(position).setOption6(false);
		totalInformation.getQuestions().get(position).setOption7(false);
	}

}
