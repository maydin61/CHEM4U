package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraysPractice3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int num = scanner.nextInt();

        if (num<=0){
            System.out.println("invalid Entry");
            System.exit(0);
        }
        int [] numbers= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter a numbers");
            numbers [i] = scanner.nextInt();


        }

        Arrays.sort(numbers);

        //int max [0]= new int[Arrays.stream(numbers).max(0)];

        System.out.println(Arrays.toString(numbers));

        System.out.println();
        scanner.close();

    }
}
