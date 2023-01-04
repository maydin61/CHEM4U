package JAVA_coding.src.MUHTAR_Practice.day_18_Nasted_Loop;

import java.util.Scanner;

public class neastedLoopPractice {
    public static void main(String[] args) {


        while (true) {
            System.out.println("enter your age:");
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();

            while (!(age >= 18 && age < 121)) {
                System.out.println("Invalid entry re-enter your age:");
                age = scan.nextInt();
            }
            System.out.println(" Would you like to continue");
            String answer="yes";
            if (answer.equalsIgnoreCase("no")){
                break;
            }
        }

    }
}