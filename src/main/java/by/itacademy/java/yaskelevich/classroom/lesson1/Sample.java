package by.itacademy.java.yaskelevich.classroom.lesson1;

public class Sample {
	public static void main(String[] args) {

		int a = 1;
		System.out.println("a = " + a);

		final int b = a;
		System.out.println("b = " + b);

		System.out.println("change a...");
		a = 2;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
