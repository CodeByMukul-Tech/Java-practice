package Encapsulated;

public class USER_DETAILS {

    protected String name;
    protected int Brith_year;
    protected String address;

    public int getBrith_year() {
        return Brith_year;
    }

    public String getAger() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAger(String address) {
        this.address = address;
    }

    public void setBrith_year(int brith_year) {
        Brith_year = brith_year;
    }

    public void setName(String name) {
        this.name = name;
    }
}
