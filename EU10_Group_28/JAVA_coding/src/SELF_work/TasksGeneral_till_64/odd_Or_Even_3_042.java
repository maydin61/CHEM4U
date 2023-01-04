package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class odd_Or_Even_3_042 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        if (number%2==0){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+" is odd");
        }
    }
}
