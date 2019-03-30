package com.test.mvc.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayBasedAccessInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws IOException {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(calendar.DAY_OF_WEEK);
		if (day == 6) {
			response.getWriter().write("app is closed on friday");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView modelAndview) {
		System.out.println("postHandler method called: after handler method preHandle() executes");
	}

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex) throws Exception {
		System.out.println("afterCompletion method called: after view resolver executes");
	}

}
