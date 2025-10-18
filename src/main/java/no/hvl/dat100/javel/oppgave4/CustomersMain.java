package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

    /*
    Customer number 1002
Name  Bob Johnson
Email bob@example.com
Agreement NORGESPRICE

Customer number 1003
Name  Charlie Rose
Email charlie@example.com
Agreement POWERSUPPORT

    */

        Customer julie = new Customer("julie", "email.com", 1234, PowerAgreementType.NORGESPRICE);
        Customer kari = new Customer("kari", "mailen til kari",4321, PowerAgreementType.POWERSUPPORT);
        //Oppgave 1

        Customers kunder = new Customers(6);
        kunder.addCustomer(julie);


        System.out.println();

        //Oppgave 2
        int antall = kunder.countNonNull();
        System.out.println(antall);

        System.out.println();

        //Oppgave 3
        System.out.println(kunder.getCustomer(1234));

        System.out.println();

        //Oppgave 4
        System.out.println(kunder.addCustomer(kari));

        System.out.println();

        //Oppgave 5
        System.out.println(kunder.removeCustomer(4567));

        System.out.println();


        //Oppgave 6
       Customer[] aktive = kunder.getCustomers();
       System.out.println(aktive);

        System.out.println();



        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

        System.out.println(printInvoice());
    }
}
