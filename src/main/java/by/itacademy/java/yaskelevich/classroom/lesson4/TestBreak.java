package by.itacademy.java.yaskelevich.classroom.lesson4;

public class TestBreak {
	public static void main(String[] args) {
		int i = 17;
		while (i < 28) {
			if ((i % 13) == 0) {
				break;
			}
			i++;
		}
		System.out.println("First number is : " + i);
	}
}
