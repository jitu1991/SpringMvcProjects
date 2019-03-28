package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.mvc.pojo.Student;

@Controller
public class StudentAdmissionController {

	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"mobile"});
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/admission", method=RequestMethod.GET)
	protected ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("admissionForm");
		return modelAndView;
	}
	
	/*@RequestMapping(value="/submit", method=RequestMethod.POST)
	protected ModelAndView submit(@RequestParam(value="studentName", defaultValue="a") String name, @RequestParam("studentCountry") String country) {
		ModelAndView modelAndView = new ModelAndView("admissionSuccess");

		Student student = new Student();
		student.setStudentName(name);
		student.setCountry(country);
		
		modelAndView.addObject("msg", "Admission for " + name + " done in " + country);
		modelAndView.addObject("student", student);
		return modelAndView;
	}*/
	
	/*@ModelAttribute
	public void addingCommonObject(Model model) {
		model.addAttribute("headerMessage", "Header Message");
	}*/
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	protected ModelAndView submit(@ModelAttribute Student student, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("admissionSuccess");
		if(result.hasErrors()) {
			ModelAndView error = new ModelAndView("admissionForm");
			return error;
		}
		modelAndView.addObject("msg", "College");
		return modelAndView;
	}
}
