package by.itacademy.java.yaskelevich.classroom.lesson4;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] array = {2, 7, 6, 3, 0, 1};
		Arrays.sort(array);
	
	
	for( int element : array) {
		System.out.println(element + ":");
	}
}
}
