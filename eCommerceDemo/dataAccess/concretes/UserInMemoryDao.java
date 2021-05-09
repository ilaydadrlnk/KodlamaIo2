package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserInMemoryDao implements UserDao {
	private List<User> users;

	public UserInMemoryDao() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getFirstname());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý hafýzadan silindi : " + user.getFirstname());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcýnýn hafýzadaki bilgileri güncellendi : " + user.getFirstname());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
