package by.itacademy.java.yaskelevich.home.practic3.task2;

public class ArrayChar {
    private static final int ONE = 1;
    private static final int ZERO = 0;
    private final int[][] array = new int[128][2];
    private int getIndex = -1;
    private int setIndex = 0;

    public int getChar(final int index) {
        ++getIndex;
        return array[getIndex][ZERO];
    }

    public void setChar(final int character) {
        this.array[setIndex][ZERO] = character;
        this.array[setIndex][ONE] = 1;
        ++setIndex;
    }

    public boolean checkIsNew(final int character) {
        for (int i = 0; i < setIndex; i++) {
            if (array[i][ZERO] == character) {
                ++array[i][ONE];
                return false;
            }
        }
        return true;
    }

    public void showHowMany() {
        System.out.println();
        for (int i = 0; i < setIndex; i++) {
            System.out.printf("char \'%s\' = %d\n", (char) array[i][ZERO], array[i][ONE]);
        }
    }

    public void showPutChar(final int character) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][ZERO] == character) {
                System.out.printf("You'r character %s = %d;\n", (char) array[i][ZERO],
                        array[i][ONE]);
            }
        }
        System.out.println();
    }

    public void showMaxChar() {
        int max = 0;
        int mark = 0;
        for (int i = 0; i < setIndex; i++) {
            if (max < array[i][ONE]) {
                max = array[i][ONE];
                mark = i;

            }
        }
        System.out.printf("\nmax is: \'%s\' = %d;\n\n", (char) array[mark][ZERO], array[mark][ONE]);
    }

    public int getIndex() {
        return this.setIndex;
    }

}