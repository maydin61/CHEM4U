package JAVA_coding.src.MUHTAR_Practice.day_17_BranchingStatementsWhileAndDo;

import java.util.Scanner;

public class whileLoopCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter a number");
        int number1=scan.nextInt();

        System.out.println("enter a number");
        int number2=scan.nextInt();

        System.out.println("enter a math operator");
        char ch=scan.next().charAt(0);
        while ( !(ch == '+' || ch == '-')){



       // if ( ch == '+' || ch == '-'){
         //   System.out.println("invalid operator, pls re-enter ");
          //  ch =scan.next().charAt(0);
        }
        System.out.println ((ch =='+') ? number1+number2 : number1-number2);
    }
}
