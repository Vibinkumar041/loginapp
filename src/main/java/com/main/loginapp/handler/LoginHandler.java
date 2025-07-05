package com.main.loginapp.handler;

import com.main.loginapp.business.LoginBusiness;
import com.main.loginapp.interfaces.LoginInterface;

public class LoginHandler {
	public String submit(String userName, String password) {
		String outputString = null;
		LoginInterface loginInterface = null;
		try {
			loginInterface = new LoginBusiness();
			outputString = loginInterface.submit(userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputString;
	}
}
