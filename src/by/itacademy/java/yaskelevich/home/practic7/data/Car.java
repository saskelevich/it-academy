package by.itacademy.java.yaskelevich.home.practic7.data;

public class Car {
    private Integer id;
    private String name;
    private Integer modelId;

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

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(final Integer modelId) {
        this.modelId = modelId;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + ", modelId=" + modelId + "]";
    }

}
