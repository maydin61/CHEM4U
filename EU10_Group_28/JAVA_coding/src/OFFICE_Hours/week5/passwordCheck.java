package OfficeHours.Week5;

import java.util.Scanner;

public class passwordCheck {
    public static void main(String[] args) {
        String password="Aydin123!";
        Scanner scan=new Scanner(System.in);
        int guessNo=0;

        while (true){
            System.out.println("enter password");
            String guess=scan.next();
            if (guess.equals(password)){
                System.out.println("well come to dashboard = " );
                break;
            }
            guessNo++;
            if (guessNo ==3){
                System.out.println("account block");
                break;
            }
        }
    }
}
