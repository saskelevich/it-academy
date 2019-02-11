package by.itacademy.java.yaskelevich.home.practical0.validation;

public class Validator {

	public int converter(String str) {
		int num = 0;
		try {
			num = Integer.parseInt(str);
		}catch(NumberFormatException exc) {
			System.out.println(exc);
			return 0;
		}
		return validator(num);
	}
	
	private int validator(int num) {
		if((num > 0) && (num < 13)) {
			return num;
		}return 0;
	}

}
