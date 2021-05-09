package eCommerceDemo.core;

import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.googleAuthentication.GoogleAuthenticationManager;

public class GoogleAuthenticationManagerAdapter implements LoggerService {

	@Override
	public void log(User user) {
		GoogleAuthenticationManager googleAuthenticationManager=new GoogleAuthenticationManager();
		googleAuthenticationManager.signUp(user);
		
	}

}
