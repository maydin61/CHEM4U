package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class campusTime_tasks_2 {
    public static void main(String[] args) {
        System.out.println("Please enter a time to check Campus open or not");
        Scanner scan=new Scanner(System.in);
        Double time= scan.nextDouble();
        if (time>8.00 & time<23.01){
            System.out.println("open");}
        else {
            System.out.println("closed");}

        /*Create a class called CampusTime, an integer variable named time is
given with a number between 1~24 has been initialized, write a program
that can find out if the campus is open or not. Campus is open from 8
am(8) to 11 pm (23) If user enters a time within the open time they
should see message: “open”  but if the time entered is outside of
operating hours they should see: “ closed”

         */


    }
}
