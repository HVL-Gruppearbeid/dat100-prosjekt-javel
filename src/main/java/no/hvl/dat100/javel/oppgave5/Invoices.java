package no.hvl.dat100.javel.oppgave5;


import static no.hvl.dat100.javel.oppgave2.MonthlyPower.computePowerUsage;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {

        public class PowerUsage {

            private double[][] usage; // strømforbruk per dag og time

            public PowerUsage(double[][] usage) {
                this.usage = usage;
            }

            public double[][] getUsage() {
                return usage;
            }

            public void setUsage(double[][] usage) {
                this.usage = usage;
            }


            public void printUsageSummary() {
                System.out.println("Power usage summary:");
                System.out.printf("Total usage: %.2f kWh%n", computePowerUsage(usage));
                System.out.println("Average per day: " + String.format("%.2f", computePowerUsage(usage) / usage.length) + " kWh");
            }
        }

    }
}
