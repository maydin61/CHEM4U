package JAVA_coding.src.MUHTAR_Practice.day_15;

import java.util.Scanner;

public class minNumberWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MIN_VALUE; // MIN VALUE FINDING

        System.out.println("How many number you wanted to use to check:");

        int ix = scanner.nextInt();
        for (int i = 0; i <ix ; i++) {
            System.out.println("enter a number");
            int number = scanner.nextInt();

            if (number < min) {
                min = number;
            }
        }
        System.out.println("Min. number is " + min);
    }
}