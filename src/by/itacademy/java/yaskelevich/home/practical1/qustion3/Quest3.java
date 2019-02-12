package by.itacademy.java.yaskelevich.home.practical1.qustion3;

/**
 * вывести на консоль количество чисел, содержащих только четные цифры
 * 
 * @author ys
 *
 */
public class Quest3 {

	private final int TEN = 10;

	private int even = 0;
	private int[] arr;

	public void showEven(String[] args) {
		for (int i = 0; i < args.length; i++) {
			summEven(convert(Integer.parseInt(args[i]), args[i].length()));
		}
		System.out.println(even);
	}

	public int[] convert(int num, int length) {
		arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (num / Math.pow(TEN, length - 1));
			num = (int) (num - arr[i] * Math.pow(TEN, length - 1));
			length--;
		}
		return arr;
	}

	private void summEven(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				continue;
			} else
				return;
		}
		even++;
	}
}
