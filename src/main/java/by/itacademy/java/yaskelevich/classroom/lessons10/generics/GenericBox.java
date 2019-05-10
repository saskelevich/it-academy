package by.itacademy.java.yaskelevich.classroom.lessons10.generics;

public class GenericBox<MyType> {
    private MyType item;

    public MyType getItem() {
        return item;
    }

    public void setItem(final MyType item) {
        this.item = item;
    }
}
