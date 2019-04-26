package by.itacademy.java.yaskelevich.home.practic7.data;

public class Model {
    private Integer id;
    private String name;
    private Integer brandId;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(final Integer brandId) {
        this.brandId = brandId;
    }

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
        return "Model [id=" + id + ", name=" + name + ", brandId=" + brandId + "]";
    }

}
