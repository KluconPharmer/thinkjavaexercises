package thinkjavatuts;

import java.util.Scanner;

public class TotalSeconds {

    public static void main(String[] args) {

        int hours;
        int minutes;
        int seconds;

        int secondsPerHours = 3600;
        int secondsPerMinutes = 60;
        int secondsPerSeconds = 60;
       Scanner scan = new Scanner(System.in);

        System.out.println("How many seconds? ");
        int input = scan.nextInt();

        hours = input / secondsPerHours;
        minutes = (input % 3600) / secondsPerMinutes;
        seconds = input % secondsPerSeconds;

        System.out.printf("%d hours, %d minutes, and %d seconds ",hours,minutes,seconds);
    }

}
