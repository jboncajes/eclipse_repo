package org.ssglobal.training.codes.login;

public class LoginFactory { // factory class
	
	public boolean isValidUser() {
		LoginAuth login = new LoginAuth();
		LogPermission permission = new LogPermission();
		Logout out = new Logout();
		
		return true;
	}

}
