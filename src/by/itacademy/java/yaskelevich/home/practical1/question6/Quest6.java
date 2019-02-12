package by.itacademy.java.yaskelevich.home.practical1.question6;

import by.itacademy.java.yaskelevich.home.practical1.qustion3.Quest3;

/**
 * вывести на консоль первое число, цифры в котором идут в строгом порядке
 * возрастания
 * 
 * @author ys
 *
 */
public class Quest6 {

	private Quest3 ob = new Quest3();

	public void show(String[] args) {
		System.out.print("First number(example 123): " + check(args));
	}

	private String check(String[] args) {
		for (int i = 0; i < args.length; i++)
			if (toIntArr(args[i])) {
				return args[i];
			}
		return null;
	}

	private boolean toIntArr(String args) {
		int[] array = new int[args.length()];
		array = ob.convert(Integer.parseInt(args), args.length());
		return valid(array);
	}

	private boolean valid(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (!chkAllNumbToStr(i, ++i, array))
				return false;
		}
		return true;
	}

	private boolean chkAllNumbToStr(int i, int y, int[] array) {
		if (y < array.length - 1) {
			if (!chkAllNumbToStr(i, ++y, array))
				return false;
		}
		return (array[i] < array[y]);

	}
}
