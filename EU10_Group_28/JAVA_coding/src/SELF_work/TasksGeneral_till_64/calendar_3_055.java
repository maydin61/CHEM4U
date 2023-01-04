package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class calendar_3_055 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of months");

        int monthNumber = scan.nextInt();
        switch (monthNumber) {
            case 1:     // checking single case with multiple variable
                System.out.println("Jan");
                break; // used to change and break out the follow
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;

            default:   // like else statement final part
                System.out.println("Invalid month number");
                break;    // optional to use break comment in at the end

        }
    }
}