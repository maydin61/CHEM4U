package week_4_09_2022;

import java.util.Scanner;

public class day10_nested_if {
    public static void main(String[] args) {
        System.out.println("Enter your score");
        Scanner scan = new Scanner(System.in);
        Integer score = scan.nextInt();
        String result="";
        if (score >= 0 && score < 100) ;
        {
            if (score >= 60 && score < 101) {
                result="Passed";
            } else if (score < 60) {
                result="Failed";
            }else result="Invalid score";
        }
        System.out.println(result);
    }
}