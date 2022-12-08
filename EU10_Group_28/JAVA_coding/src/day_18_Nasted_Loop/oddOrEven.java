package day_18_Nasted_Loop;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println(" The number is even");
        } else {
            System.out.println("The number is odd");
        }
        System.out.println("Would you like to enter another number?");
        String answer = scan.nextLine().toLowerCase();

        while (! (answer.equals("no") || answer.equals("yes"))) {
            System.err.println("Please re-enter , Would you like to enter another number?");
            answer=scan.next().toLowerCase();
            if (answer.equals("no")) {
                break;

            }
        }
    }
}