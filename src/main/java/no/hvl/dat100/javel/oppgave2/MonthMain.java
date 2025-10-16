package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

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

        //Test for print_PowerUsage
        MonthlyPower.print_PowerUsage(power_usage_month);

        //Test for print_PowerPrices
        MonthlyPower.print_PowerPrices(power_prices_month);

        //Test for computePowerUsage
        System.out.println("Summer strømforbruk for en måned: " + MonthlyPower.computePowerUsage((power_usage_month)) + " kWh");

        //Test for exceedThreshold, test 1 for fritidsbolig, test 2 for bolig
        System.out.println("Forbruk over eller under grensen (True/False): " + MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println("Forbruk over eller under grensen (True/False): " + MonthlyPower.exceedThreshold(power_usage_month, 5000));

        //Test for computeSpotPrice
        System.out.println("Spotpris: " + MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month) + " NOK");

        //Test for computePowerSupport
        System.out.println("Støtte for en gitt måned: " + MonthlyPower.computePowerSupport(power_usage_month, power_prices_month) + " NOK");

        //Test for computeNorgesPrice
        System.out.println("Norgespris med forbruk for en måned: " + MonthlyPower.computeNorgesPrice(power_usage_month) + " NOK");

    }
}