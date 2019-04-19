package by.itacademy.java.yaskelevich.classroom.lesson23.xmlmarshaling.task;

public class Shipto {
    private String name;
    private String adress;
    private String city;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(final String adress) {
        this.adress = adress;
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

    @Override
    public String toString() {
        return "Shipto [name=" + name + ", adress=" + adress + ", city=" + city + ", country=" + country + "]";
    }

}
