package by.itacademy.java.yaskelevich.classroom.lessons4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//2.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
public class Task2 {

	public static void main(String[] args) throws IOException {
// rename - ALT+SHIFT+R
// extract variable/method - ALT+SHIFT+T

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("введите количество цифр");

		int count = Integer.parseInt(bufferedReader.readLine()); // input from console

		Random random = new Random();
		for (int i = 0; i < count; i++) {
			System.out.print(random.nextInt(100) + " ");
		}

		for (int i = 0; i < count; i++) {
			System.out.println(random.nextInt(100));
		}
	}
}
