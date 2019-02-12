package by.itacademy.java.yaskelevich.home.practical1.question5;

/**
 * вывести на консоль простые числа (делятся без остатка только на 1 и само на
 * себя)
 * 
 * @author ys
 *
 */
public class Quest5 {

	public void showPrimeNumber(String[] args) {

		System.out.print("\nPrime numbers: ");
		check(args);
		System.out.println();
	}

	void check(String[] args) {
		for (int i = 0; i < args.length; i++) {
			boolean isPrime = true;
			for (int y = 2; y < Integer.parseInt(args[i]); y++) {
				isPrime = isTrue(args, i, isPrime, y);
			}
			print(args, i, isPrime);
		}
	}

	void print(String[] args, int i, boolean isPrime) {
		if (isPrime && Integer.parseInt(args[i]) != 1 && Integer.parseInt(args[i]) != 0)
			System.out.print(args[i] + "; ");
	}

	private boolean isTrue(String[] args, int i, boolean isPrime, int y) {
		if ((Integer.parseInt(args[i]) % y) == 0) {
			return false;
		} else
			return isPrime;
	}

}
