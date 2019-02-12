package by.itacademy.java.yaskelevich.home.practic1.var1.print;

import by.itacademy.java.yaskelevich.home.practic1.var1.in.InputHandler;

public class Print {

	private final String[] MONTH = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };
	private final int ONE = -1;
	
	private InputHandler ob = new InputHandler();

	public void start() {
		System.out.print("Write month number(1-12): ");
		int num = ob.put();
		answer(num);
	}
	
	private void answer(int num) {
		if (num > 0) {
			System.out.println("You're month is: " + MONTH[num + ONE]);
		} else {
			System.out.println("\nIts not a number ,ore number is not valid.\nTry again.\n");
			start();
		}
	}
}