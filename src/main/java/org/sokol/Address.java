package org.sokol;

public class Address {

    private String street;
    private String zip;
    private String city;

    public Address(String street, String zip, String city) {
        this.setStreet(street);
        this.setZip(zip);
        this.setCity(city);
    }
/*
    public String getInfo() {

        String opis;
        opis = ("Ulica " + getStreet() + "Kod " + getZip() + "Miasto " + getCity());

        return opis;
    }
*/
    @Override
    public String toString() {
        return "Address{" +
                "street='" + getStreet() + '\'' +
                ", zip='" + getZip() + '\'' +
                ", city='" + getCity() + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
