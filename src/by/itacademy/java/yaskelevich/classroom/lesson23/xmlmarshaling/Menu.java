package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "breakfast_menu")
public class Menu {
    private List<Food> foods;

    @XmlElement(name = "food")
    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(final List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        final String objectsAsString = foods.stream().map(f -> "\n" + f.toString()).reduce("", String::concat);
        return "Menu:" + objectsAsString;

    }
}
