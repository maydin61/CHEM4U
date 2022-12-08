package week_05_4_08_10_2022;

import java.util.Scanner;

public class calculatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        double number1=scanner.nextDouble();

        System.out.println("Please enter second number");
        double number2=scanner.nextDouble();
        System.out.println("please enter your operator");
        char operator = scanner.next().charAt(0);
        double result=0;
        switch (operator){
            case '+':
                result=number1+number2;
                break;

            case '-':
            result=number1-number2;
            break;

            case '*':
            result=number1*number2;
            break;

            case '/':
            result=number1/number2;
            break;

            default:
                System.out.println("operation wrong");
                break;
        }
        System.out.println(result);

   }
}



