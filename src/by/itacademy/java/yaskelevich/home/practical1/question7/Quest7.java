package by.itacademy.java.yaskelevich.home.practical1.question7;

/**
 * вывести на консоль простые числа (делятся без остатка только на 1 и само на
 * себя)
 * 
 * @author ys
 *
 */
public class Quest7 {

	private final int TWO = 2;

	public void show(String[] args) {
		System.out.print("Prime numbers: ");
		for (int i = 0; i < args.length; i++) {
			if(isPrime(args[i]))
				System.out.print(args[i] + "; ");
		}
	}

	private boolean isPrime(String args) {
		if(Integer.parseInt(args) == TWO)
			return true;
		return check(1, Integer.parseInt(args));
	}

	private boolean check(int i, int num) {
		if (i < num - 1) {
			if (!check(++i, num))
				return false;
		}
		return (num % i != 0);
	}
}
