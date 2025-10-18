package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        String streng = "";
        for (int i = 0; i < usage.length; i++){
            streng += "Dag";
            streng += i + 1;
            streng += ": ";
            for( int j = 0; j < usage[i].length; j++){
                streng += usage[i][j];
                streng += "KWH";
                if( j < usage[i].length - 1){
                    streng += ", ";
                }
            }
            System.out.println(streng);
            streng = "";
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        String streng = "";
        for (int i = 0; i < prices.length; i++){
            streng += "Dag";
            streng += i + 1;
            streng += ": ";
            for( int j = 0; j < prices[i].length; j++){
                streng += prices[i][j];
                streng += "NOK";
                if( j < prices[i].length - 1){
                    streng += ", ";
                }
            }
            System.out.println(streng);
            streng = "";
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for( int i = 0; i < usage.length; i++)
            for ( int j = 0; j < usage[i].length; j++){
                sum += usage[i][j];
            }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double sum = 0;
        int i= 0;


        while(exceeded == false && i < powerusage.length){
            for (int j = 0; j < powerusage[i].length; j++) {
                sum += powerusage[i][j];
                if (sum > threshold) {
                    exceeded = true;
                } else if (i == powerusage.length - 1 && j == powerusage[i].length - 1) {
                    break;
                }
            }
            i += 1;

        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for( int i = 0; i < usage.length; i++)
            for ( int j = 0; j < usage[i].length; j++){
                price += usage[i][j] * prices[i][j];
            }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double sum = 0;


        for( int i = 0; i < usage.length; i++)
            for ( int j = 0; j < usage[i].length; j++){
                support = usage[i][j] * prices[i][j];
                if (support > 0.9375) {
                    support -= 0.9375;
                    support = support * 0.9;
                } else {
                    support = 0;
                }
                sum += support;

            }


        return sum;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for( int i = 0; i < usage.length; i++)
            for ( int j = 0; j < usage[i].length; j++){
                price = price + ( usage[i][j] * 0.5);
            }

        return price;
    }
}
