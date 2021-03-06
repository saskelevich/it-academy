package by.itacademy.java.yaskelevich.home.practic1.var2.task2;

// вывести на консоль те числа, длина которых меньше (больше) средней, а также
// длину
public class Task2 {
    private final int aver;

    public Task2(final String[] args) {
        this.aver = average(args);
    }

    private int average(final String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i].length();
        }
        return sum / args.length;
    }

    public double getAverage() {
        return this.aver;
    }

    public void showLess(final String[] args) {
        System.out.print("Less: ");
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() < this.aver) {
                System.out.print(args[i] + "(" + args[i].length() + "): ");
            }
        }
        System.out.println();
    }

    public void showLarger(final String[] args) {
        System.out.print("Larger: ");
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > this.aver) {
                System.out.print(args[i] + "(" + args[i].length() + "): ");
            }
        }
        System.out.println();
    }

    public void showAverage() {
        System.out.println("Average = " + getAverage() + "\n");
    }
}
