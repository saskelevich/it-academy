package by.itacademy.java.yaskelevich.home.book.chapter1;

public class QuestA2 {
	public static void main(String[] args) {

		if (args != null) {
			for (int i = (args.length - 1); i >= 0; i--) {
				System.out.println(args[i] + "\n");
			}
		}
	}
}
