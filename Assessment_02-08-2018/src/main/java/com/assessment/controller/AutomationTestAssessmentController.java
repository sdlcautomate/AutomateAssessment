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
import com.assessment.service.AutomationTestAssessmentService;
import com.assessment.service.AutomationTestMessageService;
import com.assessment.service.ConstructQuestionnaireService;

@RestController
public class AutomationTestAssessmentController {
	
	@Autowired
	private AutomationTestAssessmentService automationService;
	
	@Autowired
	private ConstructQuestionnaireService questionnaireService;
	
	@Autowired
	private AutomationTestMessageService messageService;
	
	@RequestMapping(value = "/questions-1a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions1a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-1a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-1a", method = RequestMethod.POST)
	public ModelAndView startAssessment(Model model, ModelAndView view, HttpSession httpSession) {
		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		totalInformation = questionnaireService.getAutomationTestQuestionnaireDetails(totalInformation);
		view.setViewName("html/questions-1a");
		model.addAttribute("totalInformation", totalInformation);

		System.out.println("After 1st questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-2a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions2a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-2a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-2a", method = RequestMethod.POST)
	public ModelAndView questions_2a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest, @Valid TotalInformation totalInformation2) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_1a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-2a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 2nd questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
		
	@RequestMapping(value = "/questions-3a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions3a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-3a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-3a", method = RequestMethod.POST)
	public ModelAndView questions_3a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_2a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-3a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 3rd questions : ");
		System.out.println(totalInformation.toString());

		return view;
	}
	
	@RequestMapping(value = "/questions-4a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions4a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-4a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-4a", method = RequestMethod.POST)
	public ModelAndView questions_4a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_3a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-4a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 4th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-5a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions5a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-5a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-5a", method = RequestMethod.POST)
	public ModelAndView questions_5a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_4a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-5a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 5th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	@RequestMapping(value = "/questions-6a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions6a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-6a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-6a", method = RequestMethod.POST)
	public ModelAndView questions_6a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_5a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-6a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 6th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	@RequestMapping(value = "/questions-7a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions7a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-7a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-7a", method = RequestMethod.POST)
	public ModelAndView questions_7a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_6a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-7a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 7th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	@RequestMapping(value = "/questions-8a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions8a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-8a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-8a", method = RequestMethod.POST)
	public ModelAndView questions_8a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_7a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-8a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 8th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-9a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions9a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-9a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-9a", method = RequestMethod.POST)
	public ModelAndView questions_9a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_8a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-9a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 9th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questions-10a", method = RequestMethod.GET)
	public ModelAndView navigationQuestions10a(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-10a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questions-10a", method = RequestMethod.POST)
	public ModelAndView questions_10a(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_9a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/questions-10a");
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 10th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}
	
	@RequestMapping(value = "/questionsSubmit", method = RequestMethod.GET)
	public ModelAndView submittedQuestions(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions-10a");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}
	
	@RequestMapping(value = "/questionsSubmit", method = RequestMethod.POST)
	public ModelAndView submittedQuestions(Model model, ModelAndView view, HttpSession httpSession,
			HttpServletRequest httpRequest) {

		System.out.println("Entered into personal details get method");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		automationService.setQuestion_10a(httpSession, httpRequest, totalInformation);
		view.setViewName("html/report-yes");
		messageService.setReportMessage(totalInformation);
		model.addAttribute("totalInformation", totalInformation);
		System.out.println("After 10th questions : ");
		System.out.println(totalInformation.toString());
		return view;
	}

}
