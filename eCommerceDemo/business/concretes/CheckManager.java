package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.CheckService;

public class CheckManager implements CheckService{

	@Override
	public boolean emailCheck(String email) {       
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()) {
            return true;
        }else if(email.isEmpty()){
        	System.out.println("Email giriniz.");
        	System.out.println("*******************");
        	return false;
        }else {
        	System.out.println("Geçersiz email adresi.");
        	System.out.println("*******************");
            return false;
        }
        
        
		
	}

	@Override
	public boolean firstNameCheck(String firstName) {
	     if(firstName.length() < 2) {
	    	 System.out.println("ÝSÝM 2 HARFTEN KÜÇÜK OLAMAZ.");
	    	 System.out.println("*******************");
	    	 return false;
	     }
	     return true;
	    
	}

	@Override
	public boolean lastNameCheck(String lastName) {
		 if(lastName.length() < 2) {
	    	 System.out.println("SOYÝSÝM 2 HARFTEN KÜÇÜK OLAMAZ.");
	    	 System.out.println("*******************");
	    	 return false;
	     }
	     return true;
	}

	@Override
	public boolean passwordCheck(String password) {
		 if(password.length() < 6) {
	    	 System.out.println("PAROLA EN AZ 6 KARAKTER OLMALIDIR.");
	    	 System.out.println("*******************");
	    	 return false;
	     }else if (password.isEmpty()) {
	    	 System.out.println("LÜTFEN ÞÝFRE GÝRÝNÝZ.");
	    	 System.out.println("*******************");
	    	 return false;
	    	 
	     }
		
	     return true;
	}

	
	

}
