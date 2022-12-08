package TasksGeneral_till_64;

import java.util.Scanner;

public class conditional_Practice01_3_046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input an number");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive");

        } else if (number < 0) {
            System.out.println(number + " is negative");

        } else {
            System.out.println("");
        }
    }
}
