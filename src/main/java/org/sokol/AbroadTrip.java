package org.sokol;

public class AbroadTrip extends Trip {

    private Double insurence;

    public AbroadTrip(Date start, Date end, String destination, Double price, Double insurence) {
        super(start, end, destination, price);
        this.insurence = insurence;
    }


    public void setInsurence(Double insurence) {
        this.insurence = insurence;
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+insurence;
    }
}
