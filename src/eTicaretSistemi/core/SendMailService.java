package eTicaretSistemi.core;

import eTicaretSistemi.entities.concretes.User;

public interface SendMailService {
	
	String toProduceCode(User user);
	void sendMail(User user);
	boolean certifyCode(String code);
	boolean userCheck();

}
