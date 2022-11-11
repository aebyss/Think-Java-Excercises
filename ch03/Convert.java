package ch03;

import java.util.Scanner;

public class Convert {
    /**
     * Converts centimeters to feet and inches
     */


    public static void main(String[] args) {
        double cm;

        Scanner sc = new Scanner(System.in);

        int inches;
        int feet;
        int remainder;

        final double CM_PER_INCH = 2.5;
        final int IN_PER_FOOT = 12;

        // prompt the user how many cm
        System.out.print("How many cm? ");
        cm = sc.nextDouble();

        // convert and output the result

        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in \n", cm, feet, remainder);



    }
}
