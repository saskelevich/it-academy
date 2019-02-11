package by.itacademy.java.yaskelevich.home.practical1.quest2;

public class Quest2 {
	private double aver;
	
	public Quest2(String[] args) {
		this.aver = average(args);
	}
	
	private int average(String[] args) {
		int sum = 0;
		for( int i = 0; i < args.length; i++) {
			sum += args[i].length();
		}
		return sum/args.length;
	}

	public double getAverage() {
		return this.aver;
	}
	
	public void showLess(String[] args) {
		System.out.print("Less: ");
		for( int i = 0; i < args.length; i++) {
			if(args[i].length() < this.aver)
				System.out.print(args[i] + ": ");
		}
		System.out.println();
	}
	
	public void showLarger(String[] args) {
		System.out.print("Larger: ");
		for( int i = 0; i < args.length; i++) {
			if(args[i].length() > this.aver)
				System.out.print(args[i] + ": ");
		}
		System.out.println();
	}
}
