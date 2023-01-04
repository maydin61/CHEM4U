package JAVA_coding.src.MUHTAR_Practice.day_17_BranchingStatementsWhileAndDo;

import java.util.Scanner;

public class marriageProposal {
    public static void main(String[] args) {
        // will you marry me if yes, congrats
        // no , Goodbye
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me yes/no ?");

        String answer=scan.next().toLowerCase();
        String answerYes="yes";
        String answerNo="no";

        while (!(answer.equals(answerYes) || answer.equals(answerNo)) ) {
            System.out.println("Invalid answer re-enter again");
            answer=scan.next().toLowerCase();
        }


        if (answer.equals(answerYes)){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }
    }
}
