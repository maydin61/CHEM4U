package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class OxygenTank_Part2_Task4 {
    public static void main(String[] args) {
        System.out.println("Level of oxygen in the tank");
        Scanner scan = new Scanner(System.in);
        Integer oxygenLevel = scan.nextInt();

        String tank = "";
        if (oxygenLevel>90){
            tank = "Your Tank is full";
        } else if (oxygenLevel>=90) {
            tank = "Still okay";
        } else if (oxygenLevel>=80) {
            tank = "Don't go too far";
        } else if (oxygenLevel>=70) {
            tank = "Start to head back";
        }else {
            tank = "Be careful now you at 50%";
        }
        System.out.println(tank);






        }
    }



/*Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (oxygenLevel) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -
USE ONE PRINT STATEMENT ONLY

 */