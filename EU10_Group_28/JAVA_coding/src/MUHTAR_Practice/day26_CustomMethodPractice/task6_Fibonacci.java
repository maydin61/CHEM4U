package JAVA_coding.src.MUHTAR_Practice.day26_CustomMethodPractice;

import java.util.Arrays;

public class task6_Fibonacci {
    private static int fibonacciNumbers;
    private static int[] fiBonnacciArray;

    public static void main(String[] args) {

        int [] result= fiBonacciNumbers(8);
        System.out.println("");
        System.out.println(Arrays.toString(result));



    }
    public static int[] fiBonacciNumbers(int  numbers){
        int [] fiBonnacciArray= new int[numbers];
        fiBonnacciArray[0]=0;
        fiBonnacciArray[1]=1;
        fiBonnacciArray[2]=1;
        fiBonnacciArray[3]=2;
        for (int i = 4; i <numbers ; i++) {
            fiBonnacciArray[i]=fiBonnacciArray[i-1]+fiBonnacciArray[i-2];
        }
        for (int each:fiBonnacciArray) {
            System.out.print(each+", ");
        }
        return fiBonnacciArray;
    }
    public static int[] fiBonacciNumbersPrint(int numbers ){
        int [] newFiBonnaciNumber = fiBonnacciArray;
        System.out.println(Arrays.toString(newFiBonnaciNumber));
        System.out.println(Arrays.asList(0,numbers-2));
        return newFiBonnaciNumber;
    }

}
