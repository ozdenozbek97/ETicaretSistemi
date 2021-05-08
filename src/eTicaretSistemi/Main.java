package eTicaretSistemi;


import eTicaretSistemi.business.abstracts.AuthService;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.concretes.AuthManager;
import eTicaretSistemi.business.concretes.UserManager;
import eTicaretSistemi.core.SendMail;
import eTicaretSistemi.dataAccsess.concretes.HibernateUserDao;
import eTicaretSistemi.entities.concretes.User;

public class Main {
	public  static void main(String[] args) {
		
		UserService userManager = new UserManager(new HibernateUserDao());
		AuthService authManager = new AuthManager(userManager,new SendMail());
		
		User user= new User(1,"özden", "Özbek", "ozdnozbk@gmail.com", "12346");
		
		authManager.register(user);
		
		authManager.login("ozdnozbk@gmail.com","123456");
		
}
}