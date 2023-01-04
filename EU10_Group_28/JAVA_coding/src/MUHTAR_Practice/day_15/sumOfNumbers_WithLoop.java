package JAVA_coding.src.MUHTAR_Practice.day_15;

import java.util.Scanner;

public class sumOfNumbers_WithLoop {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<5; i++){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println("=========");
        int total=0;


            Scanner scan=new Scanner(System.in);
            System.out.println("Enter number");

            for (int i = 0; i <5 ; i++) {      // add to between scanner and calculation to run loop

            total += scan.nextInt();   // adding to directly to first value total




                
            }      System.out.println("total: "+total);

        }
    }

