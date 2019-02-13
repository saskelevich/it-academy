package by.itacademy.java.yaskelevich.home.practic1.var2.quest6;

import by.itacademy.java.yaskelevich.home.practic1.var2.quest3.Quest3;

//вывести на консоль первое число, цифры в котором идут в строгом порядке возрастания
public class Quest6 {

    private final Quest3 ob = new Quest3();

    public void show(final String[] args) {
        System.out.println("\nIncreasing number: " + check(args) + ";\n");
    }

    private String check(final String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (toIntArr(args[i]) && (args[i].length() > 1)) {
                return args[i];
            }
        }
        return "";
    }

    private boolean toIntArr(final String args) {
        int[] array = new int[args.length()];
        array = ob.convert(Integer.parseInt(args), args.length());
        return valid(array);
    }

    private boolean valid(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!checkAllNumbToStr(i, ++i, array)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkAllNumbToStr(final int i, final int y, final int[] array) {
        int tmp = y;
        if (tmp < array.length - 1) {
            if (!checkAllNumbToStr(i, ++tmp, array)) {
                return false;
            }
        }
        return (array[i] < array[y]);

    }
}
