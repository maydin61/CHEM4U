package zulfiarMeeting;

import java.util.Scanner;

public class Patient_Information {
    public static void main(String[] args) {
        System.out.println("Enter your e-mail address");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Enter your street ");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Enter your First Name ");
        String firstName = new Scanner(System.in).nextLine();
        System.out.println("Enter your Last Name ");
        String lastName = new Scanner(System.in).nextLine();
        System.out.println("Enter your City ");
        String city = new Scanner(System.in).nextLine();
        System.out.println("Enter your State ");
        String state = new Scanner(System.in).nextLine();
        System.out.println("Enter your Zipcode ");
        String zipCode = new Scanner(System.in).nextLine();


        System.out.println("Weight:");
        Integer weight = (Integer) new Scanner(System.in).nextInt();

        System.out.println("Heigth: ");
        Integer heigth = (Integer) new Scanner(System.in).nextInt();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(address);
        System.out.println(state);
        System.out.println(city);
        System.out.println(zipCode);

        System.err.println("H:  "+(double)heigth+"W: "+(double)weight);





    }
}
