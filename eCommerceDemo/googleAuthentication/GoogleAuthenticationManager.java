package eCommerceDemo.googleAuthentication;

import eCommerceDemo.entities.concretes.User;

public class GoogleAuthenticationManager {
	public void signUp(User user) {
		System.out.println("Google ile giri� yap�ld�: " + user.getFirstname()+ " " + user.getLastName());
		
	}

}
