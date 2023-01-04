package JAVA_coding.src.MUHTAR_Practice.day_16_for_Loop_String_Practices;

import java.util.Scanner;

public class eligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter age: ");
        int age=scan.nextInt();

        while (!(age>=19 && age<=120)){
            System.err.println("Invalid entry , pls re-enter again :");
            age=scan.nextInt();
        }
        System.out.println("Are you US citizen? yes / no");
        String answer=scan.nextLine();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("invalid entry, please re-enter");
            answer=scan.nextLine();
            System.out.println("Are you US citizen? yes / no");
    }

        System.out.println(" you are eligible to vote");
    }
}
