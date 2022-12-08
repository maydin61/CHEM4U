package TaskGeneral_from_85;

import java.util.Scanner;

public class partty_DoWhileLoop_3_086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        String guestList = "";
        String answer = "";
        do {
           System.out.println("Please enter a guest name");
            name = scan.nextLine();
            guestList+=name;

            System.out.println("Do you want to enter new guest name : yes/no ");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("yes" ) ) {
                guestList+=", ";
            }

            } while (answer.equalsIgnoreCase("yes")) ;
            System.out.println("Guest List : "+ guestList);


       }
}
