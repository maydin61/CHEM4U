package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class SoppingList_030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double tPrice = 0;
        System.out.println("Enter Item " + count + " Price");


        do {
            item = scan.next();
            price = scan.nextDouble();
            tPrice += price;
            shoppingListReport += "Item " + count + " : " + item + " Price " + price;
            System.out.println("Add one more item, yes/no");
            countinue = scan.next();
            if (countinue.equals("yes")) {
                shoppingListReport += ", ";
            }
            count++; // adding of more item

        } while (countinue.equals("yes") && count <= 10);
        System.out.println(shoppingListReport);
        System.out.println("Total Price : "+tPrice);
    }
}

