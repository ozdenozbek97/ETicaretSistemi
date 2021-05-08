package eTicaretSistemi.dataAccsess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretSistemi.dataAccsess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
	users.add(user);
	System.out.println("kullanýcý kaydedildi");
		
	}

	@Override
	public void update(User user) {
		for(User users: users) {
			if(users.getId()==user.getId()) {
				users.setFirstName(user.getFirstName());
				users.setLastName(user.getLastName());
				users.seteMail(user.geteMail());
				users.setPassword(user.getPassword());
				System.out.println("Bilgileriniz güncellenmiþtir");
			}
		}
		
	}

	
	@Override
	public void delete(String firstName, String lastName, String password) {
		for(User users: users) {
			if(users.getFirstName()==firstName &&
					users.getLastName()==lastName && 
					users.getPassword()==password) {
				
				((List<User>) users).remove(users);
				
				System.out.println("Hesabýnýz silinmiþtir");
			}
		}
		
	}

	@Override
	public User get(int id) {
		User user = new User();
		for(User users: users) {
			if(users.getId()==id) {
				user= users;
			}
		}
		return user;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
