package by.itacademy.java.yaskelevich.classroom.lesson4;

public class TestContinue {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++){
			if( i == 3) {
				System.out.println("continue!");
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}
