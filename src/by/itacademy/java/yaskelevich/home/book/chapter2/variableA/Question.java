package by.itacademy.java.yaskelevich.home.book.chapter2.variableA;

public class Question {

////////////////////////////////////////////////////////////////////////////////////////////////

//	private Integer[] num;
	private String[] numS;
////////////////////////////////////////////////////////////////////////////////////////////////

	public Question() {
	}

//	public Question(String[] numbers) {
//		num = new Integer[numbers.length];
//		for (int i = 0; i < numbers.length; i++) {
//			num[i] = new Integer(numbers[i]);
//		}
//	}

	public Question(String[] args) {

		numS = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			numS[i] = new String(args[i]);
		}

	}

////////////////////////////////////////////////////////////////////////////////////////////////

	public void quest1() {

		System.out.print("Max = ");
		for (String a : numS) {
			int index = 0;
			for (String b : numS) {
				if (a.length() >= b.length())
					index++;
			}
			if (index == numS.length)
				System.out.print(" " + a + ": ");
		}
		System.out.print("\n");

		System.out.print("Min = ");
		for (String a : numS) {
			int index = 0;
			for (String b : numS) {
				if (a.length() <= b.length())
					index++;
			}
			if (index == numS.length)
				System.out.print(" " + a + ":");
		}
		System.out.print("\n");

	}

////////////////////////////////////////////////////////////////////////////////////////////////

	public void quest2(boolean index) {

		String tmp;

		for (int i = 0; i < numS.length; i++) {
			for (int y = 0; y < numS.length; y++) {
				if (index) {
					if (numS[i].length() < numS[y].length()) {
						tmp = numS[i];
						numS[i] = numS[y];
						numS[y] = tmp;
					}
				} else {
					if (numS[i].length() > numS[y].length()) {
						tmp = numS[i];
						numS[i] = numS[y];
						numS[y] = tmp;
					}
				}
			}
		}
		System.out.println("Sort array" + (index ? " ++ :" : " -- :"));
		for (String i : numS) {
			System.out.print(i + ": ");
		}
		System.out.println();
	}

////////////////////////////////////////////////////////////////////////////////////////////////

	public void quest3() {

		int sum = 0;

		for (int i = 0; i < numS.length; i++) {
			sum += numS[i].length();
		}
		sum /= numS.length;
		quest3V0(sum);
	}

	public void quest3V0(int sum) {

		System.out.print("== sum: ");
		for (int i = 0; i < numS.length; i++) {
			if (numS[i].length() == sum) {
				System.out.print(numS[i] + ": ");
			}
		}

		System.out.print("\n\n< sum: ");
		for (int i = 0; i < numS.length; i++) {
			if (numS[i].length() < sum) {
				System.out.print(numS[i] + ": ");
			}
		}
		System.out.print("\n\n> sum: ");
		for (int i = 0; i < numS.length; i++) {
			if (numS[i].length() > sum) {
				System.out.print(numS[i] + ": ");
			}
		}
		System.out.println();
	}

////////////////////////////////////////////////////////////////////////////////////////////////

}
