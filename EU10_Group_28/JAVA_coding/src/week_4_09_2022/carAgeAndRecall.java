package week_4_09_2022;

import java.util.Scanner;

public class carAgeAndRecall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE BELOW:

        String result = (vehicleYear >= 1995 && vehicleYear <= 1998) ?
                "Your vehicle needs to be recalled!" :
                (vehicleYear >= 2001 && vehicleYear <= 2002) ?
                        "Your vehicle needs to be recalled!" :
                        (vehicleYear >= 2004 && vehicleYear <= 2006) ?
                                "Your vehicle needs to be recalled!" :
                                (vehicleYear >= 2015 && vehicleYear <= 2017) ?
                                        "Your vehicle needs to be recalled!" :
                                        "Your vehicle is fine, enjoy!";
        System.out.println(result);




    }
}