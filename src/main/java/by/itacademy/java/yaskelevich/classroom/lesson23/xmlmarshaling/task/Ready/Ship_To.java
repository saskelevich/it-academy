package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task.Ready;

public class Ship_To {
    private String name;
    private String address;
    private String city;
    private String country;

    public Ship_To() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ShipTo{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", city='" + city + '\''
                + ", country='" + country + '\'' + '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }
}
