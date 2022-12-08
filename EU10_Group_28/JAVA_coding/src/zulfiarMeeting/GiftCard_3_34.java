package zulfiarMeeting;

import java.util.Scanner;

public class GiftCard_3_34 {
    public static void main(String[] args) {
        System.out.println("Please choose the item that you wanted to buy from the list " +
                "\nIF YOU HAVE A GIFT CARD LESS THAN 100$");
        System.out.println("Charger,USB cable, Headphone," +
                " Pants, Hat, Socks, Blanket, Pillow");
        Scanner scan=new Scanner(System.in);
        String item= scan.nextLine();
        int balance=100;
// String equality always use   .equality method    equalsIgnoreCase
        if( item.equals("Smartphone") ||  item.equals("Laptop")  ){
                             //       ||  meaning is    " or "
            System.out.println("Sorry not enough founds in your gift card");

        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase");
            balance=balance-15;
            System.out.println("Your current balance is "+balance+ "$");


        } else if (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase");
            balance = balance - 10;
            System.out.println("Your current balance is " + balance + "$");

        }else if (item.equals("Head phone")) {
            System.out.println("Thank you for your purchase");
            balance = balance - 25;
            System.out.println("Your current balance is " + balance + "$");

        }else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase");
            balance = balance - 50;
            System.out.println("Your current balance is " + balance + "$");

        }else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase");
            balance = balance - 5;
            System.out.println("Your current balance is " + balance + "$");

        }else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase");
            balance = balance - 60;
            System.out.println("Your current balance is " + balance + "$");

        }else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase");
            balance = balance - 40;
            System.out.println("Your current balance is " + balance + "$");
        } else{
            System.out.println("Invalid item");
        }
    }
}
