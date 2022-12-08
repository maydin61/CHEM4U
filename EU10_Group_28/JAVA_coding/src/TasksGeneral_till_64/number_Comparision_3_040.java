package TasksGeneral_till_64;

import java.util.Scanner;

public class number_Comparision_3_040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1+" greater than "+number2);
        } else if (number2 > number1) {
            System.out.println(number2+" greater than "+number1);

        } else {
            System.out.println(number1+" equals to "+number2);
        }
    }
}