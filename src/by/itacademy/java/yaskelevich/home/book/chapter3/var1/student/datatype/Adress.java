package by.itacademy.java.yaskelevich.home.book.chapter3.var1.student.datatype;

public class Adress {
    private String land;
    private String sity;
    private String streat;
    private int numberHome;
    private int numberApartment;

    public Adress() {

    }

    public Adress(final Adress adr) {
        this.land = adr.getLand();
        this.sity = adr.getSity();
        this.streat = adr.getStreat();
        this.numberHome = adr.getNumberHome();
        this.numberApartment = adr.getNumberApartment();
    }

    public Adress(final String land, final String sity, final String streat, final int numberHome,
            final int numberApartment) {
        this.land = land;
        this.sity = sity;
        this.streat = streat;
        this.numberHome = numberHome;
        this.numberApartment = numberApartment;
    }

    public void setLand(final String land) {
        this.land = land;
    }

    public String getLand() {
        return land;
    }

    public void setSity(final String sity) {
        this.sity = sity;
    }

    public String getSity() {
        return sity;
    }

    public void setStreat(final String streat) {
        this.streat = streat;
    }

    public String getStreat() {
        return streat;
    }

    public void setNumberHome(final int numberHome) {
        this.numberHome = numberHome;
    }

    public int getNumberHome() {
        return numberHome;
    }

    public void setNumberApartment(final int numberApartment) {
        this.numberApartment = numberApartment;
    }

    public int getNumberApartment() {
        return numberApartment;
    }

}
