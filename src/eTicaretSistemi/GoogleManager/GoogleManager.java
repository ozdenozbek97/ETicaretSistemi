package eTicaretSistemi.GoogleManager;

import eTicaretSistemi.entities.concretes.User;

public class GoogleManager {
	
	public void registerWithGoogle(User user) {
		System.out.println("google ile giriþ yapýldý: " + user.getLastName());
	}

}
