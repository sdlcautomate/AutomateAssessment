package com.assessment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assessment.model.PersonalDetails;
import com.assessment.model.TotalInformation;

@RestController
public class HomePageController {

	// welcome page controller
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome(ModelAndView model, PersonalDetails personalDetails) {
		model.setViewName("index");
		return model;
	}

	// Personal details get method
	@RequestMapping(value = "/personalDetails", method = RequestMethod.GET)
	public ModelAndView welcome(Model model, ModelAndView view, PersonalDetails personalDetails) {
		System.out.println("Entered into personal details get method");
		model.addAttribute("personaldetails", new PersonalDetails());
		view.setViewName("html/contact-info");
		return view;
	}

	// Personal details get method
	@RequestMapping(value = "/personalDetails", method = RequestMethod.POST)
	public ModelAndView processRegistrationForm(ModelAndView modelAndView, Model model,
			@Valid PersonalDetails personalDetails, BindingResult bindingResult, HttpServletRequest request,
			HttpSession httpSession) {
		httpSession.removeAttribute("totalInformation");

		System.out.println("Entered personal details post method");
		System.out.println(personalDetails.toString());
		TotalInformation totalInformation = new TotalInformation();
		totalInformation.setPersonalDetails(personalDetails);
		model.addAttribute("totalInformation", totalInformation);
		httpSession.setAttribute("totalInformation", totalInformation);
		return new ModelAndView("html/questions");
	}

	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public ModelAndView navigationQuestions(Model model, ModelAndView view, HttpSession httpSession) {
		view.setViewName("html/questions");
		TotalInformation totalInformation = (TotalInformation) httpSession.getAttribute("totalInformation");
		model.addAttribute("totalInformation", totalInformation);
		return view;
	}

}
