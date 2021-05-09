package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.ValidityService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;


public class ValidityManager implements ValidityService {
	private UserDao userDao;
	
	public ValidityManager() {}

	public ValidityManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean isValid(String email) {
		for(User user: userDao.getAll()) {
			if(email.equals(user.getEmail())) {
				System.out.println("EMAÝL SÝSTEMDE ZATEN KAYITLI.LÜTFEN FARKLI EMAÝL DENEYÝNÝZ.");
				return false;
			}
			
		}
		return true;
	}

}
