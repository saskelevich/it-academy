package by.itacademy.java.yaskelevich.home.practical1.quest1;

public class Length {
	private String min, max;
	
	private void isMax(String args) {
		if (this.max.length() < args.length()) {
			this.max = args;
		}
	}

	private void isMin(String args) {
		if (this.min.length() > args.length()) {
			this.min = args;
		}
	}

	private void search(String[] args) {
		for (int i = 0; i < args.length; i++) {
			isMax(args[i]);
			isMin(args[i]);
		}
	}

	private void getValue(String args) {
		this.max = this.min = args;
	}
	
	public void show(String[] args) {
		getValue(args[0]);
		search(args);
		System.out.println(
				"Max = " + max + " (length = " + max.length() + ")\n" + "Max = " + min + " (length = " + min.length() + ")");
	}
}
