package day_15;

import java.util.Scanner;

public class maxNumberWithLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 5 numbers to find the max.");
        int max = scanner.nextInt(); // MAX VALUE FINDING

        for (int i = 0; i <4 ; i++) {
            System.out.println("enter a number");
        int number=scanner.nextInt();

        if (number>max){
            max=number;
        }
        }
            System.out.println("Max. number is "+max);

    }
}
