package com.assessment.service;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.assessment.model.TotalInformation;
import com.assessment.util.AppConstants;

@Service
public class AutomationTestAssessmentService {
	private final String selectdCheckBoxStatus = AppConstants.ON;
	private void listAllParameters (HttpServletRequest httpRequest) {
		System.out.println("XXX -Key/Value\t ");
		Enumeration<String> parameterNames =  httpRequest.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String k = parameterNames.nextElement();
			System.out.println("Key/Value\t " + k +":" + httpRequest.getParameter(k));
		}

	}
	
	public void setQuestion_1a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		List<String> list = new ArrayList<String>();
		listAllParameters(httpRequest);
		resetOptions(totalInformation, 0);
		
		
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox100a"))) {
			totalInformation.getQuestions().get(0).setOption1(true);
			list.add(AppConstants.QUESTION_1a_OPTION_1);			
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox101a"))) {
			totalInformation.getQuestions().get(0).setOption2(true);
			list.add(AppConstants.QUESTION_1a_OPTION_2);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox102a"))) {
			totalInformation.getQuestions().get(0).setOption3(true);
			list.add(AppConstants.QUESTION_1a_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox103a"))) {
			totalInformation.getQuestions().get(0).setOption4(true);
			list.add(AppConstants.QUESTION_1a_OPTION_4);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox104a"))) {
			totalInformation.getQuestions().get(0).setOption5(true);
			totalInformation.getQuestions().get(0).setOther1(httpRequest.getParameter("questions[0].other1"));			
			list.add(AppConstants.QUESTION_1a_OPTION_5);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox105a"))) {
			totalInformation.getQuestions().get(0).setOther2(httpRequest.getParameter("questions[0].other2"));
			totalInformation.getQuestions().get(0).setOption6(true);
			list.add(httpRequest.getParameter("questions[0].other2"));
		}

		totalInformation.getQuestions().get(0).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}
	
	public void setQuestion_2a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		//listAllParameters(httpRequest);
		
		resetOptions(totalInformation, 1);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox200a"))) {
			totalInformation.getQuestions().get(1).setOption1(true);
			list.add(AppConstants.QUESTION_2a_OPTION_1);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox201a"))) {
			totalInformation.getQuestions().get(1).setOption2(true);
			list.add(AppConstants.QUESTION_2a_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox202a"))) {
			totalInformation.getQuestions().get(1).setOption3(true);
			list.add(AppConstants.QUESTION_2a_OPTION_3);
		}
		totalInformation.getQuestions().get(1).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}

	public void setQuestion_3a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		//listAllParameters(httpRequest);
		
		resetOptions(totalInformation, 2);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox300a"))) {
			totalInformation.getQuestions().get(2).setOption1(true);
			list.add(AppConstants.QUESTION_3a_OPTION_1);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox301a"))) {
			totalInformation.getQuestions().get(2).setOption2(true);
			list.add(AppConstants.QUESTION_3a_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox302a"))) {
			totalInformation.getQuestions().get(2).setOption3(true);
			list.add(AppConstants.QUESTION_3a_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox303a"))) {
			totalInformation.getQuestions().get(2).setOption4(true);
			list.add(AppConstants.QUESTION_3a_OPTION_4);
		}
		totalInformation.getQuestions().get(2).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}

	public void setQuestion_4a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		listAllParameters(httpRequest);
	
		resetOptions(totalInformation, 3);
		List<String> list = new ArrayList<String>();
		System.out.println("httpRequest.getParameter(\"questions[3].radio3\")" + httpRequest.getParameter("questions[3].radio3"));
		totalInformation.getQuestions().get(3).setRadio3(httpRequest.getParameter("questions[3].radio3"));
		
		if ("checkbox400a".equals(httpRequest.getParameter("questions[3].radio3"))) {
			totalInformation.getQuestions().get(3).setOption1(true);
			list.add(AppConstants.QUESTION_4a_OPTION_1);
		}

		if ("checkbox401a".equals(httpRequest.getParameter("questions[3].radio3"))) {
					totalInformation.getQuestions().get(3).setOption2(true);
			list.add(AppConstants.QUESTION_4a_OPTION_2);
		}
		
		if ("checkbox402a".equals(httpRequest.getParameter("questions[3].radio3"))) {
						totalInformation.getQuestions().get(3).setOption3(true);
			list.add(AppConstants.QUESTION_4a_OPTION_3);
		}
		if ("checkbox403a".equals(httpRequest.getParameter("questions[3].radio3"))) {
				totalInformation.getQuestions().get(3).setOption4(true);
			list.add(AppConstants.QUESTION_4a_OPTION_4);
		}
		totalInformation.getQuestions().get(3).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	}

	public void setQuestion_5a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 4);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox500a"))) {
			totalInformation.getQuestions().get(4).setOption1(true);
			list.add(AppConstants.QUESTION_5a_OPTION_1);			
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox501a"))) {
			totalInformation.getQuestions().get(4).setOption2(true);
			list.add(AppConstants.QUESTION_5a_OPTION_2);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox502a"))) {
			totalInformation.getQuestions().get(4).setOption3(true);
			list.add(AppConstants.QUESTION_5a_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox503a"))) {
			totalInformation.getQuestions().get(4).setOther1(httpRequest.getParameter("questions[4].other1"));
			totalInformation.getQuestions().get(4).setOption6(true);
			list.add(httpRequest.getParameter("questions[4].other1"));
		}

		totalInformation.getQuestions().get(4).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);

	}
	
	public void setQuestion_6a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 5);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox600a"))) {
			totalInformation.getQuestions().get(5).setOption1(true);
			list.add(AppConstants.QUESTION_6a_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox601a"))) {
			totalInformation.getQuestions().get(5).setOption2(true);
			list.add(AppConstants.QUESTION_6a_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox602a"))) {
			totalInformation.getQuestions().get(5).setOption3(true);
			list.add(AppConstants.QUESTION_6a_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox603a"))) {
			totalInformation.getQuestions().get(5).setOption4(true);
			list.add(AppConstants.QUESTION_6a_OPTION_4);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox604a"))) {
			totalInformation.getQuestions().get(5).setOther1(httpRequest.getParameter("questions[5].other1"));
			totalInformation.getQuestions().get(5).setOption6(true);
			list.add(httpRequest.getParameter("questions[5].other1"));
		}

		totalInformation.getQuestions().get(5).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);

	}
	
	public void setQuestion_7a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 6);
		List<String> list = new ArrayList<String>();
		System.out.println("httpRequest.getParameter(\"questions[6].radio6\")" + httpRequest.getParameter("questions[6].radio6"));
		totalInformation.getQuestions().get(6).setRadio6(httpRequest.getParameter("questions[6].radio6"));
		
		
		if ("checkbox700a".equals(httpRequest.getParameter("questions[6].radio6"))) {
			totalInformation.getQuestions().get(6).setOption1(true);
			list.add(AppConstants.QUESTION_7a_OPTION_1);			
		}

		if ("checkbox701a".equals(httpRequest.getParameter("questions[6].radio6"))) {
			totalInformation.getQuestions().get(6).setOption2(true);
			list.add(AppConstants.QUESTION_7a_OPTION_2);
		}

		if ("checkbox702a".equals(httpRequest.getParameter("questions[6].radio6"))) {
				totalInformation.getQuestions().get(6).setOption3(true);
			list.add(AppConstants.QUESTION_7a_OPTION_3);
		}
		if ("checkbox703a".equals(httpRequest.getParameter("questions[6].radio6"))) {
				totalInformation.getQuestions().get(6).setOption3(true);
			list.add(AppConstants.QUESTION_7a_OPTION_4);
		}
		totalInformation.getQuestions().get(6).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	
	}
	
	public void setQuestion_8a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 7);
		List<String> list = new ArrayList<String>();
	    totalInformation.getQuestions().get(7).setRadio7(httpRequest.getParameter("questions[7].radio7"));
		
		
			if ("checkbox800a".equals(httpRequest.getParameter("questions[7].radio7"))) {	
				totalInformation.getQuestions().get(7).setOption1(true);
				list.add(AppConstants.QUESTION_8a_OPTION_1);			
			}

			if ("checkbox801a".equals(httpRequest.getParameter("questions[7].radio7"))) {	
			totalInformation.getQuestions().get(7).setOption2(true);
			list.add(AppConstants.QUESTION_8a_OPTION_2);
		}
			if ("checkbox802a".equals(httpRequest.getParameter("questions[7].radio7"))) {			
			totalInformation.getQuestions().get(7).setOption3(true);
			list.add(AppConstants.QUESTION_8a_OPTION_3);
		}
		if ("checkbox803a".equals(httpRequest.getParameter("questions[7].radio7"))) {			
			totalInformation.getQuestions().get(7).setOption4(true);
			list.add(AppConstants.QUESTION_8a_OPTION_4);
		}
		totalInformation.getQuestions().get(7).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
			
	}
	
	public void setQuestion_9a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 8);
		List<String> list = new ArrayList<String>();

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox900a"))) {
			totalInformation.getQuestions().get(8).setOption1(true);
			list.add(AppConstants.QUESTION_9a_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox901a"))) {
			totalInformation.getQuestions().get(8).setOption2(true);
			list.add(AppConstants.QUESTION_9a_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox902a"))) {
			totalInformation.getQuestions().get(8).setOption3(true);
			list.add(AppConstants.QUESTION_9a_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox903a"))) {
			totalInformation.getQuestions().get(8).setOption4(true);
			list.add(AppConstants.QUESTION_9a_OPTION_4);
		}
		
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox904a"))) {
			totalInformation.getQuestions().get(8).setOther1(httpRequest.getParameter("questions[8].other1"));
			totalInformation.getQuestions().get(8).setOption6(true);
			list.add(httpRequest.getParameter("questions[8].other1"));
		}
		totalInformation.getQuestions().get(8).setAnswer(list);
		httpSession.setAttribute("totalInformation", totalInformation);
	
	}
	
	public void setQuestion_10a(HttpSession httpSession, HttpServletRequest httpRequest,
			TotalInformation totalInformation) {
		resetOptions(totalInformation, 9);
		List<String> list = new ArrayList<String>();
		listAllParameters(httpRequest);

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1000a"))) {
			totalInformation.getQuestions().get(9).setOption1(true);
			list.add(AppConstants.QUESTION_10a_OPTION_1);			
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1001a"))) {
			totalInformation.getQuestions().get(9).setOption2(true);
			list.add(AppConstants.QUESTION_10a_OPTION_2);
		}

		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1002a"))) {
			totalInformation.getQuestions().get(9).setOption3(true);
			list.add(AppConstants.QUESTION_10a_OPTION_3);
		}
		if (selectdCheckBoxStatus.equals(httpRequest.getParameter("checkbox1003a"))) {
			totalInformation.getQuestions().get(9).setOption4(true);
			list.add(AppConstants.QUESTION_10a_OPTION_4);
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
