package by.itacademy.java.yaskelevich.home.book.chapter1.B;

public class NumberAction {

	protected int[] array;

	public NumberAction(String[] args) {

		this.array = new int[args.length];

		for (int i = 0; i < array.length; i++)
			this.array[i] = Integer.parseInt(args[i]);

	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// index 1

	public void showEven() {

		System.out.print("\nEven number: ");
		for (byte i = 0; i < array.length; i++) {
			if ((array[i] % 2) == 0)
				System.out.print(array[i] + "; ");
		}
		System.out.println();
	}

	public void showOdd() {

		System.out.print("\nOdd number: ");
		for (byte i = 0; i < array.length; i++) {
			if ((array[i] % 2) != 0)
				System.out.print(array[i] + "; ");
		}
		System.out.println();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 2

	public void showMaxNumber() {

		int maxNumber = 0;

		for (int i = 0; i < array.length; i++) {
			if (maxNumber < array[i])
				maxNumber = array[i];
		}
		System.out.println("\nMax number = " + maxNumber);
	}

	public void showMinNumber() {

		int minNumber = array[0];

		for (int i = 0; i < array.length; i++) {
			if (minNumber > array[i])
				minNumber = array[i];
		}
		System.out.println("\nMin number = " + minNumber);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 3

	public void showThreeNine() {

		System.out.print("\nDevided by three or nine: ");

		for (int i = 0; i < array.length; i++) {
			if (((array[i] % 3) == 0) || ((array[i] % 9) == 0)) {
				System.out.print(array[i] + "; ");
			}
		}
		System.out.println();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 4

	public void showFiveSeven() {

		System.out.print("\nDevided by five and seven: ");

		for (int i = 0; i < array.length; i++) {
			if (((array[i] % 5) == 0) && ((array[i] % 7) == 0)) {
				System.out.print(array[i] + "; ");
			}
		}
		System.out.println();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 5	

	public void showBubbleSort(int mark) {

		int tmp;

		for (int i = 0; i < array.length; i++) {
			for (int y = 0; y < array.length; y++) {
				if (mark == 0)
					if (Math.abs(array[i]) > Math.abs(array[y])) {
						tmp = array[i];
						array[i] = array[y];
						array[y] = tmp;
					}
				if (mark == -1)
					if (array[i] < array[y]) {
						tmp = array[i];
						array[i] = array[y];
						array[y] = tmp;
					}
				if (mark == 1)
					if (array[i] > array[y]) {
						tmp = array[i];
						array[i] = array[y];
						array[y] = tmp;
					}
			}
		}
		System.out.print("\nSort array: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "; ");
		System.out.println();

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 6

	public void showThreeDigitNotEquals() {

		System.out.print("\nThree digits numbers with noequal dezent: ");

		for (int i = 0; i < array.length; i++)
			if (((array[i] / 100) > 0) && (array[i] / 100 < 10)) {
				byte a, b, c;
				a = (byte) (array[i] / 100);
				b = (byte) ((array[i] - a * 100) / 10);
				c = (byte) (array[i] - a * 100 - b * 10);
				if (a != b && a != c && b != c)
					System.out.print(array[i] + "; ");
			}
		System.out.println();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//index 7

	public void showMaxDevider(int[] numbers) {

		int[] devider = new int[numbers.length - 1];

		for (int i = 0; i < devider.length; i++)
			devider[i] = gcd(numbers[i], numbers[i + 1]);

		if (devider.length > 1)
			showMaxDevider(devider);

		if (devider.length == 1)
			System.out.println("\nMax devider = " + devider[0]);

	}

	public int gcd(int a, int b) {
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

	public void showMinMultiple(int[] numbers) {

		int[] multiple = new int[numbers.length - 1];

		for (int i = 0; i < multiple.length; i++)
			multiple[i] = lcm(numbers[i], numbers[i + 1]);

		if (multiple.length > 1)
			showMinMultiple(multiple);

		if (multiple.length == 1)
			System.out.println("\nMin multiple = " + multiple[0]);
	}

	public int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 8

	public void showPrimeNumber() {

		System.out.print("\nPrime numbers: ");

		for (int i = 0; i < array.length; i++) {
			boolean isPrime = true;
			for (int y = 2; y < array[i]; y++) {
				if ((array[i] % y) == 0) {
					isPrime = false;
					break;
				} else
					continue;
			}
			if (isPrime && array[i] != 1)
				System.out.print(array[i] + "; ");
		}
		System.out.println();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 9 in method showBubbleSort

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	index 10 & 11 not understand question

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//index 13

	public void showPalindr() {
		
		int decimal = 0;
		
		for( int i = 0; i < array.length; i++) {
			decimal = howManyNumb(array[i]);
			decimal = getNumber(decimal);
			decimal /= 2;
		}
		
	}

	public int howManyNumb(int numbers) {

		int a = 1_000_000_000;
		while (true) {
			if ((numbers / a) >= 1)
				return a;
			a /= 10;
		}
	}
	
	public int getNumber( int a ) {
		
		int b = 0;
		while( a > 10) {
			a /= 10;
			b++;
		}
		return b;
	}

}




















