package by.itacademy.java.yaskelevich.classroom.lesson4;

public class Test0 {
	public static void main(String[] args) {
		int[] ints = { 1, 2, 3, 4, 5 };
		printWithFor(ints);
		printWithForEach(ints);

	}

	private static void printWithForEach(int[] ints) {
		for (int anInt : ints) {
			int j = anInt;
			System.out.println(j);
		}
	}

	private static void printWithFor(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			int j = ints[i];
			System.out.println(j);
		}
	}
}