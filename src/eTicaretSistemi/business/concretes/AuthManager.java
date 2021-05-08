package eTicaretSistemi.business.concretes;

import eTicaretSistemi.business.abstracts.AuthService;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.core.SendMailService;
import eTicaretSistemi.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	private SendMailService sendMailService;

	public AuthManager(UserService userService, SendMailService sendMailService) {
		super();
		this.userService = userService;
		this.sendMailService = sendMailService;
	}

	@Override
	public void login(String eMail, String password) {
		
		
		
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	public void register(String string) {
		// TODO Auto-generated method stub
		
	}

}
