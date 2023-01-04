package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class Quiz_Questions_3_043 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the farthest planet in the solar system");
        System.out.println("a)Venus");
        System.out.println("b)Pluto");
        System.out.println("c)Neptune");
        String answer = scanner.next();
        if (answer.equals("b")) {
            System.out.println("b is correct");
        } else if (answer.equals("c") || answer.equals("a")) {
            System.out.println(answer + " is wrong answer.");

        } else {
            System.out.println("is invalid answer");
        }
    }
}