package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class trial {
       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many total shares they have already?");
        int share = scanner.nextInt();
        if (share > 0) {
            System.out.println("What is the total value in the stock market is ");
            Scanner scanner1=new Scanner(System.in);
            double totalValue= scanner1.nextDouble();
            System.out.println("What is the name of Company");
            Scanner scan=new Scanner(System.in);
            String nameOfCompony=scan.next();
            System.out.println("Your total stock market holding is $"
                    +totalValue+" " +share+" shares."+nameOfCompony+" is your company holdings");










        }else {
            System.out.println("");
        }
    }

}