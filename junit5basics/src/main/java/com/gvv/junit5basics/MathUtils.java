package com.gvv.junit5basics;

public class MathUtils {

	public int add(int a, int b) {
		
		return a + b;
	}


/*
 login screen
 
 1) username - not null / no spaces between
 
 2) password - has to be min 8 characters / starts with capital
 
*/

public boolean checkUserNameFormat(String userName) {
	
	if(userName.equals(""))
	{
		return false;
	}
	else if(userName.contains(" ")) {
		return false;
	}
	else {
		return true;
	}
	}

public boolean checkPasswordFormat(String password) {

	if(password.length() < 8 || password.length() > 12) {
		 return false;
	}
	
	else if(password.length() > 8 || password.length() < 12) {
		return true;
	}
	return false;
	
}
}