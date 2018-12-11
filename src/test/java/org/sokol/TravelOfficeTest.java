package org.sokol;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TravelOfficeTest {


    static TravelOffice to;
    static Customer customer;
    static Customer customer2;
    static Trip trip;

    @BeforeClass
    public static void inicjalizacja(){

        to = new TravelOffice();
        customer = new Customer("Michał");
        customer2 = new Customer("Paweł");
        trip = new AbroadTrip(new Date(2,01,2025), new Date(5,02,2034), "Pekin",4999.99,1499.97);
    }


    @Test
    public void addCustomer() {

    int size = to.customers.size();

    to.addCustomer(customer);

    int size2 = to.customers.size();

    assertNotEquals(size,size2);


    }

    @Test
    public void addTrip() {

        int size = to.mapa.size();

        to.addTrip("wycieczka",trip);

        int size2 = to.mapa.size();

        assertNotEquals(size,size2);


    }

    @Test
    public void removeTrip() {

        to.addTrip("wycieczka",trip);
        to.addTrip("wycieczka2",trip);

        int size = to.mapa.size();

        to.removeTrip("wycieczka");

        int size2 = to.mapa.size();

        assertNotEquals(size,size2);

    }

    @Test
    public void findCustomerByName() {

        to.addCustomer(customer);

       // to.findCustomerByName("Michał");

        assertEquals(customer,to.findCustomerByName("Michał"));

    }

    @Test
    public void removeCustomer() {

        to.addCustomer(customer);
        to.addCustomer(customer2);

        int size = to.customers.size();

        to.removeCustomer(customer);

        int size2 = to.customers.size();

        assertNotEquals(size,size2);

    }
}