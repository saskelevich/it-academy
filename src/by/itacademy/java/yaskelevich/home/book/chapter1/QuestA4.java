package by.itacademy.java.yaskelevich.home.book.chapter1;

import java.util.Scanner;

public class QuestA4 {
	public static void main(String[] args) {

		String PASSWORD = "Pa$$wOrD";

		Scanner in = new Scanner(System.in);

		String password = in.next();

		System.out.println(password.equals(PASSWORD));
	}
}
