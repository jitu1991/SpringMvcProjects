package com.test.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController {// extends AbstractController {

	// @Override
	@RequestMapping("/welcome")
	protected ModelAndView welcome(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hi User, First annotation based config");
		return model;
	}

	@RequestMapping("/view")
	protected ModelAndView view(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Second message");
		return model;
	}

	@RequestMapping("/view/{name}")
	protected ModelAndView view(@PathVariable String name) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi " + name);
		return model;
	}

	/*@RequestMapping("/{name}/{country}")
	protected ModelAndView view(@PathVariable String name, @PathVariable String country) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi " + name + " from " + country);
		return model;
	}*/

	@RequestMapping("/{name}/{country}")
	protected ModelAndView view(@PathVariable Map<String, String> map) {
		String name = map.get("name");
		String country = map.get("country");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi " + name + " from " + country);
		return model;
	}

}
