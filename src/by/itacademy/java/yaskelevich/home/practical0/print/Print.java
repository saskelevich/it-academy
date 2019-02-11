package by.itacademy.java.yaskelevich.home.practical0.print;

import by.itacademy.java.yaskelevich.home.practical0.in.InputHandler;

public class Print {

	private static final String[] MONTH = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };

	private InputHandler ob = new InputHandler();

	public void start() {
		System.out.print("Write month number(1-12): ");
		int num = ob.put();
		answer(num);
	}
	
	private void answer(int num) {
		if (num > 0) {
			System.out.println("You're month is: " + MONTH[num - 1]);
		} else {
			System.out.println("\nIts not a number ,ore number is not valid.\nTry again.\n");
			start();
		}
	}
}
