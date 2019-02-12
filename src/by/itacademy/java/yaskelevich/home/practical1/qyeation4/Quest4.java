package by.itacademy.java.yaskelevich.home.practical1.qyeation4;
/**
 * вывести на консоль числа, которые делятся на 3 или на 5
 * @author ys
 *
 */
public class Quest4 {

	public void showThreeFive(String[] args) {

		System.out.print("\nDevided by three and five: ");
		for (int i = 0; i < args.length; i++) {
			if (((Integer.parseInt(args[i]) % 3) == 0) && ((Integer.parseInt(args[i]) % 5) == 0)) {
				System.out.print(args[i] + "; ");
			}
		}
		System.out.println();
	}
}
