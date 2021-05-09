package eCommerceDemo.business.concretes;



import eCommerceDemo.business.abstracts.CheckService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.ValidityService;
import eCommerceDemo.core.LoggerService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	private CheckService checkService;
	private UserDao userDao;
	private LoggerService loggerService;
	
	



	public UserManager(CheckService checkService, UserDao userDao, LoggerService loggerService)
			 {
		super();
		this.checkService = checkService;
		this.userDao = userDao;
		this.loggerService = loggerService;
		
	}

	@Override
	public void register(User user) {
		ValidityService validityService=new ValidityManager(userDao);
		
		if(validityService.isValid(user.getEmail())
				&& checkService.firstNameCheck(user.getFirstname())
				&& checkService.emailCheck(user.getEmail())
				&& checkService.lastNameCheck(user.getLastName())
				&& checkService.passwordCheck(user.getPassword())) {
			System.out.println(user.getEmail() + " adresine do�rulama linki g�nderildi. L�tfen linke t�klay�n�z.");
			userDao.add(user);
			loggerService.log(user);
			
		    System.out.println("********************************");
				}
		
	}

	@Override
	public void signIn(String email, String password) {
		
		for(int i=0; i<userDao.getAll().size();i++ ) {
			if(userDao.getAll().get(i).getEmail().equals(email) 
					&&   userDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("Giri� ba�ar�l�.");
				System.out.println("********************************");
				
				
			}
			
			
			
			
		}
		System.out.println("EMA�L YA DA PAROLA YANLI�.TEKRAR DENEY�N�Z.");
		
		
		
		
		
		
		
		
		
		
	}

	

}
