package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minAndMaxNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //int [] numbers = {2,5,4,6456,-3,567,-6,7,};

        int [] nmb = new int[5];
        for (int i = 0; i < nmb.length; i++) {
            System.out.println("Enter a number");
            nmb[i] = scan.nextInt();      // each user entered input will be assigned to the index number of the array
        }
        int max= nmb[0];
        int min = nmb[0];
        for (int i = 0; i < nmb.length; i++) {
            if (max < nmb[i]){
                max= nmb[i];
            }
            if (min > nmb[i]){
                min = nmb[i];
            }
        }
        System.out.println("numbers :"+ Arrays.toString(nmb));
        System.out.println("min number : "+min);
        System.out.println("max number : "+max);
    }
}
