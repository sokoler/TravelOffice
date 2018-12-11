package org.sokol;

public class DomesticTrip extends Trip {

    private Double OwnArrivalDiscount;


    public DomesticTrip(Date start, Date end, String destination, Double price, Double ownArrivalDiscount) {
        super(start, end, destination, price);
        OwnArrivalDiscount = ownArrivalDiscount;
    }


    @Override
    public Double getPrice() {

        return super.getPrice() - OwnArrivalDiscount;
    }

    public void setOwnArrivalDiscount(Double ownArrivalDiscount) {
        OwnArrivalDiscount = ownArrivalDiscount;
    }



}

