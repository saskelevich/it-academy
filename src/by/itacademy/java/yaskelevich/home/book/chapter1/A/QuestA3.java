package by.itacademy.java.yaskelevich.home.book.chapter1.A;

import java.util.Random;

public class QuestA3 {
	public static void main(String[] args) {

		final byte LENGTH = 10;

		Random rand = new Random();

		int[] array = new int[LENGTH];

		for (byte i = 0; i < LENGTH; i++)
			array[i] = rand.nextInt();

		for (byte i = 0; i < LENGTH; i++) {
			if (array[i] > 0)
				System.out.println(array[i] + "\n");
			else 
				System.out.print(array[i] + ": ");
		}

	}
}
