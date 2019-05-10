package by.itacademy.java.yaskelevich.classroom.lesson4;
/**
 * @author user
 * 
 * */
import java.util.Random;
/**
 * @
 * description class:
 * */
public class Test {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		System.out.println("intitial array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		for( int i = 0; i< array.length; i++) {
			array[i] +=10;
		}
		System.out.println("new array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print( array[i] + " ");
		}
	}
}