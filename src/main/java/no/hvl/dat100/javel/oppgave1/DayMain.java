package no.hvl.dat100.javel.oppgave1;


import static no.hvl.dat100.javel.oppgave1.DailyPower.*;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

       // Oppgave 1
        printPowerPrices(powerprices_day);

        // Oppgave 2
        DailyPower.printPowerUsage(powerusage_day);

        // Oppgave 3
        System.out.println(computePowerUsage(powerusage_day));

        //Oppgave 4
        System.out.println(computeSpotPrice(powerusage_day, powerprices_day));

        // Oppgave 5

        int teller = 0;
        while (teller < powerprices_day.length ){
            System.out.print("For time " + teller + ": ");
            System.out.print(getSupport(powerusage_day[teller], powerprices_day[teller]));
            teller += 1;
            System.out.print(". ");
        }
        System.out.println();

        //Oppgave 6
        System.out.println(computePowerSupport(powerusage_day, powerprices_day));

        //Oppgave 7
        System.out.println(computeNorgesPrice(powerusage_day));

        //Oppgave 8
        System.out.println(findPeakUsage(powerusage_day));

        //Oppgave 9
        System.out.println(findAvgPower(powerusage_day));




        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
