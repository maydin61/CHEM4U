package day04_Varibles;

import java.util.Scanner;

import static java.lang.System.out;

public class task14_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);// needed line for input value
        out.println("Input two numbers");
        float k = scan.nextFloat();
        float m = scan.nextFloat();
        out.println("k= " + k + "   m= " + m);
        out.println("Multiplication result is   "+k * m);
    }
}
