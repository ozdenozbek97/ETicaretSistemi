package eTicaretSistemi.business.abstracts;

import eTicaretSistemi.entities.concretes.User;

public interface AuthService {
	void login(String eMail, String password);
	void register(User user);

}
