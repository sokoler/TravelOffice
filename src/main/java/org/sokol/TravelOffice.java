package org.sokol;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {

    int customerCount =0;

   // Customer[] customers = new Customer[2];;

    Set<Customer> customers =  new HashSet<>();
    Map<String,Trip> mapa = new HashMap<>();

    public void addCustomer(Customer customer) {

       //   garage[1] = new Car("Blue");

        customers.add(customer);


     /*  if (customerCount == customers.length) {

           Customer temp[] = new Customer[customers.length + 2];
           System.arraycopy(customers, 0, temp, 0, customers.length);
           customers = temp;
       }
       customers[customerCount++] = customer;
       */
   }


   public void addTrip(String key, Trip trip){
        mapa.put(key, trip);
   }

   public boolean removeTrip(String key){
        if( mapa.containsKey(key)){
            mapa.remove(key);
            return true;
        }
        return false;
   }

   public Customer findCustomerByName(String name){

       for (Customer m : customers)
             {
                if(m.getName().equals(name)){

                    return m;

                }

       }
        return null;
   }


    public boolean removeCustomer(Customer customer){

        if(customers.contains(customer)){
            customers.remove(customer);
                    return true;
        }
        return false;
    }

    public void zwrocKlientow(){

        for (Customer cust: customers)
              {
                  System.out.println(cust.getName());

        }

    }

    public void zwrocWycieczki(){

        for (String trip: mapa.keySet())
        {
            System.out.println(trip);

        }

    }



       public void getCustomerCount(){

           System.out.println(customers.size());

       }


    @Override
    public String toString() {
        return "TravelOffice{" +
                "customers=" + customers +
                ", mapa=" + mapa +
                '}';
    }
}




