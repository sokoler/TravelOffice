package org.sokol;

abstract public class Trip {

    private Date start;
    private Date end;
    private String destination;
    private Double price;

    public Trip(Date start, Date end, String destination, Double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Trip{" +
                "start=" + start +
                ", end=" + end +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
