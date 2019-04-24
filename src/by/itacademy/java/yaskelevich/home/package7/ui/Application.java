package by.itacademy.java.yaskelevich.home.package7.ui;

import by.itacademy.java.yaskelevich.home.package7.ui.commands.AbstractCmd;
import by.itacademy.java.yaskelevich.home.package7.ui.commands.CmdHome;

public class Application {

    public static void main(final String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("старт");

        AbstractCmd nextCommand = new CmdHome();
        while (nextCommand != null) {
            nextCommand = nextCommand.execute();
        }

        System.out.println("������ ���������");
        System.exit(0);
    }
}
// старт
// -----------выберите действия-----------
// edit - изменить бд
// search - поиск машин
// edit
// -----------выберите действия-----------
// brand - редактировать брэнд
// model - изменить модель
// home - вернутся в главное меню
// brand
// -----------выберите действия-----------
// home - вернутся в главное меню
// home
// -----------выберите действия-----------
// edit - изменить бд
// search - поиск машин
