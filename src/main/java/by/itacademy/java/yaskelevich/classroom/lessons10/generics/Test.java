package by.itacademy.java.yaskelevich.classroom.lessons10.generics;

public class Test {

    public static void main(final String[] args) {
        // final ObjectBox box = new ObjectBox();
        // box.setItem("Test");
        // final Object item = box.getItem();
        // final Integer itemInt = (Integer) item;

        final GenericBox<String> myBox = new GenericBox<String>();
        myBox.setItem("Test");
    }

}
