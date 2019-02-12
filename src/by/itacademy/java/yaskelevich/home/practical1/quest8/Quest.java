package by.itacademy.java.yaskelevich.home.practical1.quest8;

import by.itacademy.java.yaskelevich.home.practical1.qustion3.Quest3;
/**
 * вывести на консоль первое число-палиндром (одинаково читающееся в обоих
 * направлениях. Например, число 404)
 * 
 * @author ys
 *
 */
public class Quest {

	private final int INDEX = -1;
	private Quest3 ob = new Quest3();
	
	public void show(String[] args) {
		System.out.print("Palindrom numbers: ");
		for(int i = 0; i< args.length; i++) {
			if(isEquals(args[i]))
				System.out.print(args[i] + "; ");
		}
		System.out.println();
	}

	private int[] conv(String args) {
		return ob.convert(Integer.parseInt(args), args.length());
	}

	private boolean isEquals(String args) {
		int[] array = conv(args);
		if(!isDigit(array))
			return false;
		for(int i = 0; i < (args.length()/2); i++) {
			if(getBegNum(array, i) != getLastNum(array, i))
				return false;
		}
		return true;
	}

	private int getBegNum(int[] array, int i) {
		return array[i];
	}

	private int getLastNum(int[] array, int i) {
		return array[array.length + (INDEX - i)];
	}
	
	private boolean isDigit(int[] array) {
		return array.length > 1 ? true : false;
	}
}
