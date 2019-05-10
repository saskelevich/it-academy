package by.itacademy.java.yaskelevich.classroom.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
		
		String line = buffRead.readLine();
		System.out.println("Hello, " + line);
	}
}
