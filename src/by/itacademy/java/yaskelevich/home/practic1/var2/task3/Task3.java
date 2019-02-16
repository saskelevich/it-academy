package by.itacademy.java.yaskelevich.home.practic1.var2.task3;

//вывести на консоль количество чисел, содержащих только четные цифры
public class Task3 {

    private static final int TEN = 10;
    private static final int ZERO = 0;

    private int even = 0;
    private int[] arr;

    public void showEven(final String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (isZero(convert(Integer.parseInt(args[i]), args[i].length()))) {
                summEven(convert(Integer.parseInt(args[i]), args[i].length()));
            }
        }
        System.out.println("Only even have " + even + " numbers");
    }

    public int[] convert(final int num, final int length) {
        int tmpNum = num;
        int tmpLength = length;
        arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (tmpNum / Math.pow(TEN, tmpLength - 1));
            tmpNum = (int) (tmpNum - arr[i] * Math.pow(TEN, tmpLength - 1));
            tmpLength--;
        }
        return arr;
    }

    private void summEven(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                continue;
            } else {
                return;
            }
        }
        even++;
    }

    private boolean isZero(final int[] array) {
        if (array.length == 1) {
            return array[0] == ZERO ? true : false;
        }
        return true;
    }
}
