package registerSystem.business.concrete;

import registerSystem.core.concrete.EmailValidation;

public class ControlManager {
	public static boolean firstNameControl(String firstName) {
		if(firstName.length()<2) {
			System.out.println("�sim en az iki karakter olmal�d�r!");
			return false;
		}
		return true;
	}
	public static boolean lastNameControl(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Soyisim en az iki karakter olmal�d�r!");
			return false;
		}
		return true;
	}
	public static boolean passwordControl(String password) {
		if(password.length()<6) {
			System.out.println("�ifre en az 6 karakter olmal�d�r!");
			return false;
		}
		return true;
	}
	public static boolean emailControl(String email) {
		if(!EmailValidation.isValid(email)) {
			System.out.println("Email ge�ersiz formatta!");
			return false;
		}
		return true;
	}
	
}
