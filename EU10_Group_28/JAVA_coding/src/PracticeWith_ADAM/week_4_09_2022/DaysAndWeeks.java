package JAVA_coding.src.PracticeWith_ADAM.week_4_09_2022;

import java.util.Scanner;

public class DaysAndWeeks {
    public static void main(String[] args) {
        System.out.println("Enter the number of month");
        Scanner scan=new Scanner(System.in);
        Integer number= scan.nextInt();

                                // :(else) ?(if)    : ..... ?........ block

       String  result=(number==1) ? "Jan.": (number==2) ? "Feb.": //sad fad face :(
               (number==3) ? "March":(number==4) ? "April.":     // is the number of Ternaries
               (number==5) ? "May":(number==6) ? "Jun":
               (number ==7) ? "July.": (number==8)? "August.":
               (number==9) ? "Sept.": (number==10) ? "Oct.":
               (number==11)? "Nov." : "Dec";
        /*
        if (number>=1 && number<=12){

            if (number==1) {
                result = "January";
            } else if (number==2) {
                result="February";
            } else if (number==3) {
                result="March";
            } else if (number==4) {
                result="April";
            } else if (number==5) {
                result="May";
            } else if (number==6) {
                result="June";
            } else if (number==7) {
                result="July";
            } else if (number==8) {
                result="August";
            } else if (number==9) {
                result="September";
            } else if (number==10) {
                result="October";
            } else if (number==11) {
                result="November";
            }else {
                result="December";}

        }else {
            result="Invalid";
        }

         */
        System.out.println(result);
    }
}
