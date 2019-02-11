package by.itacademy.java.yaskelevich.home.practical1.qustion3;

public class Quest3 {

	private final int TEN = 10;

	private int even = 0;
	private int[] arr;

	public void showEven(String[] args) {
		for (int i = 0; i < args.length; i++) {
			step2(check(Integer.parseInt(args[i]), args[i].length()));
		}
		System.out.println(even);
	}

	private int[] check(int num, int length) {
		arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (num / Math.pow(TEN, length - 1));
			num = (int) (num - arr[i] * Math.pow(TEN, length - 1));
			length--;
		}
		return arr;
	}

	private void step2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				continue;
			} else
				return;
		}
		even++;
	}
}
