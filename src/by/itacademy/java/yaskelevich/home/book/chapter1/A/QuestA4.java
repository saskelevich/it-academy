package by.itacademy.java.yaskelevich.home.book.chapter1.A;

import java.util.Scanner;

public class QuestA4 {
	public static void main(String[] args) {

		final String PASSWORD = "Pa$$wOrD";

		Scanner in = new Scanner(System.in);

		String password = in.next();

		System.out.println(password.equals(PASSWORD));
	}
}
