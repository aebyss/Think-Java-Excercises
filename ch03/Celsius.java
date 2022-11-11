package ch03;

import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");

        celsius = sc.nextDouble();

        fahrenheit = celsius * 9/5 + 32;

        System.out.printf("%.1f celsius = %.1f fahrenheit \n", celsius, fahrenheit);



    }

}
