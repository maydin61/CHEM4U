package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        System.out.println("Enter a number 1 to 7, which represent day of the week");
        Scanner scan=new Scanner(System.in);
        Integer weekDay= scan.nextInt();

        String day="";
        if(weekDay == 1){
            day="Monday";
        }else if(weekDay == 2){
            day="Tuesday";
        }else if(weekDay == 3){
            day="Wednesday";
        }else if( weekDay == 4){
            day="Thursday";
        }else if(weekDay == 5){
            day="Friday";
        }else if(weekDay==6){
            day="Saturday";
        } else{
            day="Sunday";
        }

        System.out.println("------------------------------------------------");

              System.out.println(day);
    }
}
