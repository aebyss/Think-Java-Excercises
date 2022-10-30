package ch02;

public class Time {

    public static void main(String[] args) {
        int timeOfDayInSeconds = 24 * 60 * 60;

        int hour = 13, minute = 58, second = 10;
        int timeSinceMidnightInSeconds = hour * 3600 + minute * 60 +
                second;
        int timeLeftInSeconds = timeOfDayInSeconds - timeSinceMidnightInSeconds;

        int startHour = 17, startMinute = 45, startSecond = 36;  //start time of this exercise
        int startTimeSinceMidnightInSeconds = startHour + 3600 + startMinute * 60 + startSecond;

        int timeInterval = timeSinceMidnightInSeconds - startTimeSinceMidnightInSeconds;  // this time i spent on this exercise

        System.out.println("Time since midnight: " + timeSinceMidnightInSeconds + " seconds");
        System.out.println("Time remaining today: " + timeLeftInSeconds + "seconds");
        System.out.println("Percentage of day passed: " + (double)timeSinceMidnightInSeconds / (double)(24*60*60) + "%");
        System.out.println("Elapsed time: " + timeInterval + "seconds");

    }
}
