package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling;

public class Food {
    private String name;
    private String price;
    private String description;
    private Integer calories;

    public Food() {
    }

    public Food(final String name, final String price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(final String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(final Integer calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", price=" + price + ", description=" + description + ", calories=" + calories
                + "]";
    }

}
