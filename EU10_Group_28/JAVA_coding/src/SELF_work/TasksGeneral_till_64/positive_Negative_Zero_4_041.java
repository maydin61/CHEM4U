package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class positive_Negative_Zero_4_041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number >0) {
            System.out.println(number + " greater than zero");
        } else if (number < 0) {
            System.out.println(number + " smaller than zero");

        } else {
            System.out.println(number + " equals to zero");
        }
    }
}