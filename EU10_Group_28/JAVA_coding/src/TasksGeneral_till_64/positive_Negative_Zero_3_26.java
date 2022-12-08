package TasksGeneral_till_64;

import java.util.Scanner;

public class positive_Negative_Zero_3_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("positive");
        } else if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }
}