package by.itacademy.java.yaskelevich.home.book.chapter1.A;

public class QuestA5 {
	public static void main(String[] args) {

		int summary = 0;
		
		if (args.length > 0) {
			int[] array = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				array[i] = Integer.parseInt(args[i]);
				summary += array[i];
			}
			System.out.println("Сумма = " + summary);
		}else
			System.out.println("Not write data");
	}
}
