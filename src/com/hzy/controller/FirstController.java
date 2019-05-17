package com.hzy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
@RequestMapping(value="/hello")
public class FirstController {
	
	@RequestMapping(value="/firstController")
	public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		model.addAttribute("msg", "hello world");
		return "first";
	}

}
