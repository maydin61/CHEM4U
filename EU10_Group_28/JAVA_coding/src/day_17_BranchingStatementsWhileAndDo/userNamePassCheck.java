package day_17_BranchingStatementsWhileAndDo;

import java.util.Scanner;

public class userNamePassCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user name and password");

        String userName=scan.next();
        String passWord=scan.next();

        String userName0="Aydin";
        String passWord0="MAydin123";


        if (userName0.equals(userName) && passWord.equals(passWord0)){
            System.out.println("Log in");
        }else {
            int numberOfAttempt=3;
            while ( userName.equals(userName0) || passWord.equals(passWord0)
                    && numberOfAttempt>0) {

                System.out.println("Re-enter again");
                userName=scan.next();

                System.out.println("Enter your password");
                passWord= scan.next();

                numberOfAttempt--;
            }
        if (userName.equals(userName0) && passWord.equals(passWord0)){
            System.out.println("Log in");
        }else {
            System.out.println("Your account Locked");
        }
        }

    }
}
