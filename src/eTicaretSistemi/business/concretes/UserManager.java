package eTicaretSistemi.business.concretes;

import java.util.List;

import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.dataAccsess.abstracts.UserDao;
import eTicaretSistemi.dataAccsess.concretes.HibernateUserDao;
import eTicaretSistemi.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;

	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	
	public void add(User user) {
		userDao.add(user);
		System.out.println("Kayýt baþarýlý");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
