package eTicaretSistemi.core;

import eTicaretSistemi.GoogleManager.GoogleManager;
import eTicaretSistemi.business.abstracts.AuthService;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.entities.concretes.User;

public class googleManagerAdapter implements AuthService {
	
	private UserService userService; 

	public googleManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void login(String eMail, String password) {
		if(!Controls.checkIfUserExist(userService.getAll(), eMail)) {
			if(Controls.checkUserPassword(userService.getAll(), password)) {
				return;
			}
		}
		else {
		System.out.println("Email adrese sisteme kayýtlý deðil. Sisteme kayýt olun");
		}
	}

	@Override
	public void register(User user) {
		if(Controls.checkIfUserExist(userService.getAll(),user.geteMail())) {
			if(Controls.checkFirstName(user.getFirstName())) {
				if(Controls.checkEmail(user.geteMail())) {
					if(Controls.checkPassword(user.getPassword())) {
						GoogleManager googleManager=new GoogleManager();
						
						googleManager.registerWithGoogle(user);
					}
				}
			}
			else {
				System.out.println("Kullanýcý mevcuttur");
			}
	}
	}
}
