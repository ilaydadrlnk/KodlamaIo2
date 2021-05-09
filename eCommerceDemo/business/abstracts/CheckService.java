package eCommerceDemo.business.abstracts;

public interface CheckService {
	boolean emailCheck(String email);
	boolean firstNameCheck(String firstName);
	boolean lastNameCheck(String lastName);
	boolean passwordCheck(String password);

}
