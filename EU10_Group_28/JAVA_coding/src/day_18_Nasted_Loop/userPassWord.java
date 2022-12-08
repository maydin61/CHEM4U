package day_18_Nasted_Loop;

import java.util.Scanner;

public class userPassWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your user name:");
        String user= scan.nextLine();

        System.out.println("Enter your pass word:");
        String passWord= scan.nextLine();

        if (user.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            System.out.println("Log in");
        }else{
            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect user name or pass word");
                user=scan.next();
                passWord=scan.next();
                if (user.equals("Cydeo") && passWord.equals("WoodenSpoon")){
                    System.out.println("Log in:");
                    break;
                }
            } if (!(user.equals("Cydeo") && passWord.equals("WoodenSpoon"))){
                System.err.println("Your account is locked, please contact support team");
            }
        }

    }
}
