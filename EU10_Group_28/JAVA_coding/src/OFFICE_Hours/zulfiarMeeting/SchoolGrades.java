package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        String subject1, subject2, subject3, subject4, subject5, summary;
        double grade1,  grade2,  grade3,  grade4,  grade5, average;

        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome system Grader!");

        System.out.println("Please enter the subject name 1 and score for this subject");
        subject1 = scan.nextLine();
     grade1   = scan.nextDouble();

        System.out.println("Please enter the subject name 2 and score for this subject");
        subject2 = scan.nextLine();
        grade2= scan.nextDouble();

        System.out.println("Please enter the subject name 3 and score for this subject");
        subject3 = scan.nextLine();
        grade3= scan.nextDouble();

        System.out.println("Please enter the subject name 4 and score for this subject");
        subject4 = scan.nextLine();
        grade4= scan.nextDouble();

        System.out.println("Please enter the subject name 5 and score for this subject");
        subject5 = scan.nextLine();
        grade5= scan.nextDouble();

        System.out.println();
        summary= "Summary  "+subject1+" - "+grade1+" , "
                            +subject2+" - "+grade2+" , "
                            +subject3+" - "+grade3+" , "
                            +subject4+" - "+grade4+" , "
                            +subject5+" - "+grade5;
    }
}
