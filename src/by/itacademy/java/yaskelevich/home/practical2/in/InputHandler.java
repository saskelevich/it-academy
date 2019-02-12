package by.itacademy.java.yaskelevich.home.practical2.in;

import java.util.Scanner;

import by.itacademy.java.yaskelevich.home.practical2.matrix.Matrix;

public class InputHandler {

	private final String YES[] = { "y", "Y" };

	private Scanner in = new Scanner(System.in);
	private Matrix mat = new Matrix();

	public void setMaxNum(int maxNum) {
		mat.setMax(maxNum);
	}

	public void setLength(int length) {
		mat.setLength(length);
	}

	public boolean ask() {
		if (answer(in.next()))
			return true;
		else
			return false;
	}

	public int[][] show() {
		return mat.writeMatrix();
	}

	public boolean answer(String str) {
		for (int i = 0; i < YES.length; i++)
			if (YES[i].equals(str))
				return true;
		return false;
	}
}
