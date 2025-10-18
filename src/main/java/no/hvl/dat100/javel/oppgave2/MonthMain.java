package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

import static no.hvl.dat100.javel.oppgave2.MonthlyPower.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();


        // Oppgave 1
        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println();

        //Oppgave 2
        MonthlyPower.print_PowerPrices(power_prices_month);

        System.out.println();

        //Oppgave 3
        System.out.println(computePowerUsage(power_usage_month));

        System.out.println();

        //Oppgave 4
        System.out.println(exceedThreshold(power_usage_month, 1000));

        System.out.println();

        //Oppgave 5
        System.out.println(computeSpotPrice(power_usage_month, power_prices_month));

        System.out.println();

        //Oppgave 6
        System.out.println(computePowerSupport(power_usage_month, power_prices_month));

        System.out.println();

        //Oppgave 7

        System.out.println(computeNorgesPrice(power_usage_month));






        /*

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}