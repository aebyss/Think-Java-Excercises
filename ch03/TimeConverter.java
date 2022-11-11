package ch03;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seconds;
        int hours;
        int minutes;

        System.out.println("Enter the numbers of Seconds");
        int temp = sc.nextInt();


        hours = temp / 3600;
        System.out.println(hours);
        seconds = temp % 3600;
        System.out.println(seconds);
        minutes = seconds / 60;
        System.out.println(minutes);
        seconds = seconds % 60;
        System.out.println(seconds);

        System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, seconds);


    }
}
