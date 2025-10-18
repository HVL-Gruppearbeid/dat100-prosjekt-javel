package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

       customers = new Customer[size];
        System.out.println(customers.length);

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for(int i = 0; i < customers.length; i++){
            if (customers[i] != null){
                count += 1;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for(int i = 0; i < customers.length; i++){
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id){
                funnet = true;
                c = customers[i];
                break;
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for(int i = 0; i < customers.length; i++){
            if(customers[i] == null){
                customers[i] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        for(int i = 0; i < customers.length; i++){
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id){

                deleted = true;
                c = customers[i];
                customers[i] = null;
                break;
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] ny = null;
        // lager en teller for å finne ut hvor mange aktive elementer det er i originalle tabellen
        int count = 0;
        for(int i = 0; i < customers.length; i++){
            if (customers[i] != null){
                count += 1;
            }
        }

        ny = new Customer[count];
//      setter inn de existerende elementene inn i en ny og kortere tabell.
        int teller = 0;
        for(int i = 0; i < customers.length; i++){
            if (customers[i] != null){
                ny[teller] = customers[i];
                teller += 1;
            }
        }


        return ny;
    }
}