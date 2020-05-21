package com.company;

public class GalToLitTable {
    public static void main(String[] args) {
        double inches, meters ;

        int counter;
        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + " diuimov sootvetstvuet " + meters+ " metrov ");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter =0;

            }
        }
    }
}
