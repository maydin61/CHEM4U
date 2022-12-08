package TasksGeneral_till_64;

import java.util.Scanner;

public class switchChar_3_056 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter command");

        char response = scanner.next().charAt(0);

        switch (response) {
            case 'y':
                System.out.println("Your progress being progress");
                break;
            case 'n':
                System.out.println("Thanks any way for your consideration is printed");
                break;
            case 'h':
                System.out.println("sorry no help currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again");
                break;
        }

    }
    }

