package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower.*;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

import static no.hvl.dat100.javel.oppgave2.MonthlyPower.computePowerUsage;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        amount = 0;

    }

    public void computeAmount() {

        double price = 0;
        double support = 0;
        if (c.getAgreement() == PowerAgreementType.NORGESPRICE){
            for( int i = 0; i < usage.length; i++)
                for ( int j = 0; j < usage[i].length; j++){
                    price = price + ( usage[i][j] * 0.5);
                }

        }
        double cost = 0;
        else if(c.getAgreement() == PowerAgreementType.SPOTPRICE){
            for( int i = 0; i < usage.length; i++) {
                for (int j = 0; j < usage[i].length; j++) {
                    cost = prices[i][j] * usage[i][j];
                    if (prices[i][j] > 0.9375) {

                        support =(prices[i][j] - 0.9375) * 0.9 * usage[i][j];
                    } else {
                        support = 0;
                    }
                    price += (cost - support);
                    cost = 0;
                    support = 0;
                }
            }
        }
        else{
            for( int i = 0; i < usage.length; i++)
                for ( int j = 0; j < usage[i].length; j++){
                    price += usage[i][j] * prices[i][j];
                }
        }
        this.amount = price;
    }

    public void printInvoice() {

        System.out.println("Customer number: " + c.getCustomer_id());
        System.out.println("Name:  " + c.getName());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Agreement: " + c.getAgreement());

        System.out.println("Month: " + month);
        System.out.println("Usage " + computePowerUsage(usage));
        System.out.println("Amount: " + amount);


    }
}
