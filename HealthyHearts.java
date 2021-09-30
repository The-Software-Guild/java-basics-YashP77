package assessment;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = Integer.parseInt(sc.nextLine());

        int maxHeartRate = 220 - age;

        int targetHrZoneLo = maxHeartRate/100 * 50;
        int targetHrZoneHi = maxHeartRate/100 * 85;

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + targetHrZoneLo + " - " + targetHrZoneHi + " beats per minute");



    }

}
