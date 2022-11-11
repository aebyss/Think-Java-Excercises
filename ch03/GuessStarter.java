package ch03;
import java.util.Random;

import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Im Thinking of a number between 1 and 100 \n including both. Can you gueuss what it is");

        int temp = sc.nextInt();

        System.out.println("Your Guess is: " + temp);


        Random random = new Random();



        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking was: " + number);

        int off =  number - temp;

        System.out.println("You were off by : " + off);

    }
}
