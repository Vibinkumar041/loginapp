package com.main.loginapp.business;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.main.loginapp.interfaces.LoginInterface;

public class LoginBusiness implements LoginInterface {

	@Override
	public String submit(String userName, String password) {
		JsonObject outputObject = new JsonObject();
		boolean logined = true;
		try {
			
			//Login 1
//			if (userName.equals(password)) {
//				logined = true;
//			}
			
			//Logic 2
			if (userName != null && password != null) {
				for (int u = 0; u < userName.length(); u++) {
					if (userName.charAt(u) != password.charAt(password.length() - 1 - u)) {
						logined = false;
						break;
					}
				}
			}
			
			//Logic 3
//			if (!new StringBuilder(userName).toString().equals(password)) {
//				logined = false;
//			}
			
			outputObject.addProperty("status", logined);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Gson().toJson(outputObject);
	}

}
