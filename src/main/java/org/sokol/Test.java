package org.sokol;

public class Test {

    public static void main(String[] args) {
        // write your code here

        String ulica = "Brzezińska";
        String kod = "95-040";
        String miasto = "Koluszki";

        Date start = new Date(1,10,1996);
        Date koniec = new Date(10,12,2089);

        Address adres = new Address(ulica,kod,miasto);
        Address adres2 = new Address("Kościuszki", "03-536", "Szczecin");
        Address adres3 = new Address("Mickiewicza", "45-098", "Sosnowiec");

        Customer customer = new Customer("Michał");
        Customer customer2 = new Customer("Dawid");
        Customer customer3 = new Customer("Paweł");

        TravelOffice to = new TravelOffice();


        customer.setAddress(adres);
        customer2.setAddress(adres2);
        customer3.setAddress(adres3);



        to.addCustomer(customer);
        to.addCustomer(customer2);
        to.addCustomer(customer3);



        //  System.out.println(customers[0]);
        // System.out.println(customers.length);

        AbroadTrip abroadTrip = new AbroadTrip(new Date(2,01,2025), new Date(5,02,2034), "Pekin",4999.99,1499.97);
        DomesticTrip domesticTrip = new DomesticTrip(new Date(5,06,2019), new Date(17,12,202019),"Warszawa",199.99,45.99);


      //  System.out.println( domesticTrip.getPrice());
      //  System.out.println( abroadTrip.getPrice());

        customer2.assignTrip(abroadTrip);
        customer3.assignTrip(domesticTrip);


        to.addTrip("Wycieczka", abroadTrip);
        to.addTrip("Super wycieczka", abroadTrip);
        to.addTrip("Wycieczka numer 2", domesticTrip);
        to.addTrip("Wycieczka numer 3", domesticTrip);
        customer.assignTrip(abroadTrip);

        System.out.println(to);
        to.removeTrip("Wycieczka");
        System.out.println(to);

        System.out.println("Znaleziono : " +  to.findCustomerByName("Michał"));

        System.out.println("Wszyscy klienci : ");
        System.out.println(to.zwrocKlientow());

        System.out.println("Wszystkie wycieczki : ");
        System.out.println(to.zwrocWycieczki());

        System.out.println(Date.of("1:12:2016",":"));


      //  System.out.println(Date.of("1:12:2018",":"));




    }


}
