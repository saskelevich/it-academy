package by.itacademy.java.yaskelevich.home.book.chapter1.B;

public class Quest1 {
	public static void main(String[] args) {

		NumberAction ob = new NumberAction(args);
		System.out.println("#######################################################");
		ob.showEven();
		ob.showOdd();
		ob.showMaxNumber();
		ob.showMinNumber();
		ob.showThreeNine();
		ob.showFiveSeven();
		ob.showBubbleSort(0);
		ob.showThreeDigitNotEquals();
		ob.showMaxDevider(ob.array);
		ob.showMinMultiple(ob.array);
		ob.showPrimeNumber();
		ob.showBubbleSort(-1);
		ob.showBubbleSort(1);
		System.out.println("#######################################################");
	}
}
