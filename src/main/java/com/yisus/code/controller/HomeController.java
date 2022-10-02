package com.yisus.code.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yisus.code.service.RequestService;



@Controller
public class HomeController {

	
	@Autowired
	private RequestService requestService;
	
	@GetMapping("/")
	public ModelAndView  index(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		String clientIp = requestService.getClientIp(request);
		model.addObject("clientIp", clientIp);
		return model;
	}
}
