package eTicaretSistemi.dataAccsess.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(String name, String lastName, String password);
	User get(int id);
	List<User> getAll();
	

}
