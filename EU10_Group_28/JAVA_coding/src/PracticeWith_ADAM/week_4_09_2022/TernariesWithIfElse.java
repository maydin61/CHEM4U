package JAVA_coding.src.PracticeWith_ADAM.week_4_09_2022;

import java.util.Scanner;

public class TernariesWithIfElse {
    public static void main(String[] args) {
        System.out.println("Level of oxygen in the tank");
        Scanner scan = new Scanner(System.in);
        Integer oxygenLevel = scan.nextInt();

        String tank = "";

        if (oxygenLevel > 90) {
            tank = "Your Tank is full";
        } else if (oxygenLevel >= 80) {
            tank = "Still okay";
        } else if (oxygenLevel >= 70) {
            tank = "Don't go too far";
        } else if (oxygenLevel >= 60) {
            tank = "Start to head back";
        } else {
            tank = "Be careful now you at 50%";
        }
        System.out.println(tank);
        System.out.println("================================");

        String result = (oxygenLevel > 90) ? "\"Your Tank is full\"" :
                (oxygenLevel >= 81 && oxygenLevel < 90) ? "\"Still okay\"" :
                        (oxygenLevel >= 71 && oxygenLevel < 80) ? "\"Don't go too far\"" :
                                (oxygenLevel >= 60 && oxygenLevel < 70) ? "\"Start to head back\"" :
                                        "\"Be careful now you at 50%\"";

        System.out.println(result);
    }



}
