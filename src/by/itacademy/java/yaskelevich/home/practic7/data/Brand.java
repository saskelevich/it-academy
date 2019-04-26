package by.itacademy.java.yaskelevich.home.practic7.data;

public class Brand {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand [id=" + id + ", name=" + name + "]";
    }

}
