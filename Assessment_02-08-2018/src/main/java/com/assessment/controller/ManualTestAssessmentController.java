package com.assessment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assessment.model.TotalInformation;
import com.assessment.service.ConstructQuestionnaireService;
import com.assessment.service.ManualTestAssessmentService;
import com.assessment.service.ManualTestMessageService;

@RestController
public class ManualTestAssessmentController {
	
	@Autowired
	ManualTestAssessmentService manualService;
	
	@Autowired
	private ConstructQuestionnaireService questionnaireService;
	
	@Autowired
	private ManualTestMessageService messageService;
	
	@RequestMapping(value = "/questions-1b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions1b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-1b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		totalInformation = questionnaireService.getManualTestQuestionnaireDetails(totalInformation);
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value="/questions-1b", method= RequestMethod.POST)
	public ModelAndView questions_1b(Model model, ModelAndView view, HttpSession httpSession) {
	
		System.out.println("Entered into the question number 1");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		
		view.setViewName("html/questions-1b");
		model.addAttribute("totalInformation", totalInformation);
		
		System.out.println("After 1st questions : ");
		System.out.println(totalInformation.toString());
		
		return view;
	}
	
	@RequestMapping(value = "/questions-2b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions2b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-2b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-2b", method = RequestMethod.POST)
	public ModelAndView questions_2b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest, @Valid TotalInformation totalInformation2) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_1b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-2b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 2nd questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-3b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions3b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-3b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-3b", method = RequestMethod.POST)
	public ModelAndView questions_3b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_2b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-3b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 3rd questions : ");
		System.out.println(totalInformation.toString());

		return view;
	}
	
	@RequestMapping(value = "/questions-4b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions4b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-4b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-4b", method = RequestMethod.POST)
	public ModelAndView questions_4b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_3b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-4b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 4th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-5b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions5b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-5b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-5b", method = RequestMethod.POST)
	public ModelAndView questions_5b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_4b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-5b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 5th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-6b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions6b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-6b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}	
	
	@RequestMapping(value = "/questions-6b", method = RequestMethod.POST)
	public ModelAndView questions_6b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_5b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-6b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 6th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-7b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions7b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-7b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}	
	
	@RequestMapping(value = "/questions-7b", method = RequestMethod.POST)
	public ModelAndView questions_7b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_6b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-7b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 7th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-8b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions8b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-8b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-8b", method = RequestMethod.POST)
	public ModelAndView questions_8b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_7b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-8b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 8th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-9b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions9b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-9b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}	
	
	@RequestMapping(value = "/questions-9b", method = RequestMethod.POST)
	public ModelAndView questions_9b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_8b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-9b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 9th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}

	@RequestMapping(value = "/questions-10b", method = RequestMethod.GET)
	public ModelAndView navigationQuestions10b(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-10b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}		

	@RequestMapping(value = "/questions-10b", method = RequestMethod.POST)
	public ModelAndView questions_10b(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_9b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-10b");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 10th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questionsSubmitForB", method = RequestMethod.GET)
	public ModelAndView submittedQuestions(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-10b");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
		
	@RequestMapping(value = "/questionsSubmitForB", method = RequestMethod.POST)
	public ModelAndView submittedQuestionsForB(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		manualService.setQuestion_10b(httpSession, httpRequest, totalInformation);
		view.setViewName("html/report-no");
		messageService.setReportMessage(totalInformation);
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 10th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}

}
