package JAVA_coding.src.PracticeWith_ADAM.week_4_09_2022;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        System.out.println("Enter your score between 0 to 100");
        Scanner scan = new Scanner(System.in);
        Integer score = scan.nextInt();

        String result = ""; // temp result in the same format

        if (score > 100 && score < 0) ;
        {
            result = "Invalid value";


            if (score >= 90 && score <= 100) {
                result = "Excellent";
            } else if (score >= 80 && score <= 89) {
                result = "Great";
            } else if (score >= 70 && score <= 79) {
                result = "Good";
            } else if (score >= 60 && score <= 69) {
                result = "Pass";
            } else {
                result = "Failed";
            }
            System.out.println(result);
        }
        System.out.println("========================");
    }
}