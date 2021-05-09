package eCommerceDemo;

import eCommerceDemo.business.concretes.CheckManager;
import eCommerceDemo.business.concretes.UserManager;

import eCommerceDemo.core.GoogleAuthenticationManagerAdapter;
import eCommerceDemo.dataAccess.concretes.UserInMemoryDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1, "�layda", "Durlan�k", "ilaydadrlnk@gmail.com", "5647378");
		User user2=new User(2, "�", "Durlan�k", "ilaydadrlnk@gmail.com", "675803");
		User user3=new User(3, "�layda", "D", "ilaydadrlnk@gmail.com", "ilayda678");
		User user4=new User(4, "�layda", "Durlan�k", "@gmail.com", "dsklhdf");
		User user5=new User(5, "�layda", "Durlan�k", "ilaydadrlnk@gmail.com", "564");
		
		UserManager userManager = new UserManager(new CheckManager(), new UserInMemoryDao(), new GoogleAuthenticationManagerAdapter());
		
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		userManager.register(user4);
		userManager.register(user5);
		
		
		User user6=new User(6, "Erdem", "Malca��z", "erdemalcagiz@gmail.com", "5647378");
		userManager.register(user6);

		
		userManager.signIn("erdemalcagiz@gmail.com", "5647378");
		
		
	}

}
