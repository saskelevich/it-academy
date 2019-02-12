package by.itacademy.java.yaskelevich.home.practic1.var1.in;

import java.util.Scanner;
import by.itacademy.java.yaskelevich.home.practic1.var1.validation.Validator;

public class InputHandler {
	
	private Scanner in = new Scanner(System.in);
	private Validator valid = new Validator();

	public int put() {
		String num = in.next();
		return check(num);
	}

	private int check(String num) {
		return valid.converter(num);
	}
}
