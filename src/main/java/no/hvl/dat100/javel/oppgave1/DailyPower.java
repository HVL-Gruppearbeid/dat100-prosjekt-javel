package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        String priser = "";
        for(int i = 0; i< prices.length; i++){
            priser += prices[i];
            priser += " kwh";
            if (i < (prices.length - 1)){
                priser += " ";
            }
        }
        System.out.println(priser);

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        String forbruk = "";
        for(int i = 0; i< usage.length; i++){
            forbruk += usage[i];
            forbruk += " NOK";
            if (i < (usage.length - 1)){
                forbruk += " ";
            }
        }
        System.out.println(forbruk);




    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for(int i = 0; i < usage.length; i++){
            sum = sum + usage[i];
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for(int i = 0; i < usage.length; i++){
            price = price + (usage[i] * prices[i]);
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double getSupport(double usage, double price) {

        double support = 0;

        support = usage * price;
        if (support > THRESHOLD){
            support -= THRESHOLD;
            support = support * PERCENTAGE;
        }
        else{
            support = 0;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        int sum = 0;

        for( int i = 0; i < usage.length; i++) {
            support = usage[i] * prices[i];
            if (support > THRESHOLD) {
                support -= THRESHOLD;
                support = support * PERCENTAGE;
            } else {
                support = 0;
            }
        sum += support;
        support = 0;
        }
        return sum;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for ( int i = 0; i < usage.length; i++){
            price += usage[i] * NORGESPRIS_KWH;
        }

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;
        int tall = 0;
        for(int i = 1; i < usage.length; i++){
            if( usage[i] > usage[tall]){
                tall = i;
            }
        }
        temp_max = usage[tall];
        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;

        for( int i = 0; i < usage.length; i++){
            average += usage[i];
        }
        average = average / usage.length;

        return average;
    }
}
