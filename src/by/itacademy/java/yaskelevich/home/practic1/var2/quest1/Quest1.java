package by.itacademy.java.yaskelevich.home.practic1.var2.quest1;

/**
 * вывести на консоль самое короткое и самое длинное число, а также их длину.
 * если чисел с одинаковой длиной несколько - вывести первое по очереди
 * 
 * @author ys
 *
 */
public class Quest1 {
    private String min, max;

    private void isMax(final String args) {
        if (this.max.length() < args.length()) {
            this.max = args;
        }
    }

    private void isMin(final String args) {
        if (this.min.length() > args.length()) {
            this.min = args;
        }
    }

    private void search(final String[] args) {
        for (int i = 0; i < args.length; i++) {
            isMax(args[i]);
            isMin(args[i]);
        }
    }

    private void getValue(final String args) {
        this.max = this.min = args;
    }

    public void show(final String[] args) {
        getValue(args[0]);
        search(args);
        System.out.println("Max = " + max + " (length = " + max.length() + ")\n" + "Min = " + min + " (length = "
                + min.length() + ")");
    }
}
