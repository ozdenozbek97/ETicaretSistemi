package eTicaretSistemi.core;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretSistemi.entities.concretes.User;

public class Controls {
	
	public static boolean checkPassword(String password) {
		if(password.length() < 6) {
			System.out.println("þifre en az altý karakterden oluþmalýdýr");
			
			return false;
		}
		
		else {
			System.out.println("Þifreniz oluþturuldu");}
		return true;
	}
	
	public static boolean checkEmail(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			//System.out.println("check mail");
			return true;
		}else {
			
			return false;
		}
	}

	public static boolean checkFirstName(String firstName) {
	if(firstName.length() < 2) {
		System.out.println("isim iki ya da daha fazla karakterden oluþmalýdýr");
		
		return false;
	}
	
	else {System.out.println("");
	return true;
	}
}
	
	public static boolean checkIfUserExist(List<User> users, String eMail) {
		for(User user:users) {
			if(user.geteMail()==eMail) 
				return false;
			
		}
		return true;
		
	}
	
	public static boolean checkUserPassword(List<User> users, String password ) {
		
		for (User user: users) {
			if(user.getPassword()==password)
				return true;
		}
		
		return false;
	}

}