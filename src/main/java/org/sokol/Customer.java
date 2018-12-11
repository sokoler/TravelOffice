package org.sokol;

public class Customer {

    private String name;
    private Trip trip;
    private Address address;

    public Customer(String name) {
        this.setName(name);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip){

        this.setTrip(trip);

    }
/*
    public String getInfo() {

        String opis;
        opis = ("Nazwa klienta " + getName() + " Adres " + getAddress() + " Wycieczka " + getTrip());

        return opis;
    }
*/

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", trip=" + getTrip() +
                ", address=" + getAddress() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Address getAddress() {
        return address;
    }
}
