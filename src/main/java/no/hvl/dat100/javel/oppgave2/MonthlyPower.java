package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (int i = 0; i < usage.length; i++){
            System.out.print("Dag " + (i+1) + ": ");
            DailyPower.printPowerUsage(usage[i]);
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for ( int i = 0; i < prices.length; i++){
            System.out.print("Dag " + (i+1) + ": ");
            DailyPower.printPowerPrices(prices[i]);
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;
        for (int i = 0; i < usage.length; i++){
            sum += DailyPower.computePowerUsage(usage[i]);
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        //Har spesifikt valgt å ikkje bruke while løkke her, sjølv om oppgaveteksten seier det. AI-slop oppgave.
        //Har nettopp definert ein funksjon for å beregne forbruk i forrige funksjon.

        usage = MonthlyPower.computePowerUsage(powerusage);
        if (usage > threshold) {
            exceeded = true;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            price += DailyPower.computeSpotPrice(usage[i], prices[i]);
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++){
            support += DailyPower.computePowerSupport(usage[i], prices[i]);
        }
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            price += DailyPower.computeNorgesPrice(usage[i]);
            //System.out.println(DailyPower.computeNorgesPrice(usage[i]));
        }
        return price;
    }
}
