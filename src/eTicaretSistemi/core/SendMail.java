package eTicaretSistemi.core;

import eTicaretSistemi.entities.concretes.User;

public class SendMail implements SendMailService{
	
	String verifyCode;

	@Override
	public String toProduceCode(User user) {
		this.verifyCode =String.valueOf(user.getId()) + user.getPassword();
		
		return verifyCode;
	}

	@Override
	public void sendMail(User user) {
		System.out.println(user.getFirstName() +" "+user.getLastName()+
				" kiþisine e-mail gönderildi.\n"+ verifyCode);
	}

	@Override
	public boolean certifyCode(String code) {
		if(this.userCheck()) {
			if(this.verifyCode==code) {
				return true;
			}
			else {
				return false;}
		} 
		else {
			return false;}
		
	}

	@Override
	public boolean userCheck() {
		
		return true;
	}

}
