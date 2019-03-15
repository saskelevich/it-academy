package by.itacademy.java.yaskelevich.classroom.lessons13.atm;

import java.util.ArrayList;
import java.util.List;

public class Test {// FIXME just test
    public static void main(final String[] args) {
        final List<Slot> slots = new ArrayList<Slot>(); // TODO LikedList
        slots.add(new Slot(10));
        slots.add(new Slot(50));
        slots.add(new Slot(20));

        final Atm atm = new Atm(slots);

        atm.withdraw(150);
        atm.addMoney(20, -100);
        atm.addMoney(50, 100);
        atm.addMoney(10, 100);

        atm.withdraw(150);
    }
}
