package day_20_Arrays;

import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numbers [] = {4,6,8,-6,-8,5};
        double sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum= sum+numbers[i];
        }
        double average =  (sum/numbers.length);
        System.out.println(average);


    }
}
