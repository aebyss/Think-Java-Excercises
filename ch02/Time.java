package ch02;

public class Time {

    public static void main(String[] args) {
        int hour = 12, minute = 52, second = 10;

        int timeOfDayInSeconds = 24 * 60 + 60; // time of day in seconds

        int timeSinceMidnight = hour * 3600 + minute * 60 + second; // time since midnight in seconds

        int timeLeftInSeconds = timeOfDayInSeconds - timeSinceMidnight; // time left in  the day in seconds




        System.out.println("Hi");
    }
}
