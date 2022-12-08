package zulfiarMeeting;

import java.util.Scanner;

public class Console_Menu_3_031 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("_______________");
        System.out.println("Select an option :");
        System.out.println("1)Option 1");
        System.out.println("2)Option 2");
        System.out.println("3)Option 3");
        System.out.println("_______________");


        int choice= s.nextInt();
        if (choice==1){
            System.out.println("User selected 1");
        } else if (choice == 2) {
            System.out.println("User selected 2");
        } else if (choice == 3) {
            System.out.println("User selected 3");
        }
    }
}
