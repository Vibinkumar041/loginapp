package com.main.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.loginapp.handler.LoginHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/logincontroller")
public class LoginController {

	@PostMapping("/submit")
	@ResponseBody
	public String submit(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		String outputString = null;
		LoginHandler loginHandler = new LoginHandler();
		String userName = null;
		String password = null;
		if (httpServletRequest.getParameter("userName") != null) {
			userName = httpServletRequest.getParameter("userName");
		}
		if (httpServletRequest.getParameter("password") != null) {
			password = httpServletRequest.getParameter("password");
		}
		if (!userName.isBlank() && !password.isBlank()) {
			outputString = loginHandler.submit(userName, password);
		}
		return outputString;
	}

	@GetMapping("/login")
	public String login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return "login";
	}
}
