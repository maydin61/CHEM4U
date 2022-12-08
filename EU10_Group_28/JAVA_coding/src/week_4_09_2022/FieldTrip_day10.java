package week_4_09_2022;

import java.util.Scanner;

public class FieldTrip_day10 {
    public static void main(String[] args) {

        int grade=4;
        String location = "";
        int groupNumber = 0;
        String teacher = "";



        if(grade >= 1 && grade <= 6){

            if(grade == 1 && grade==2){
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            }else if(grade == 3 && grade==4){
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else if(grade ==5 && grade==6){
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            }
        }else{
            System.out.println("Invalid Grade");
        }System.out.println("location -  "+location+
                "\nnumber of groups - "+groupNumber+
                "\nteacher in charge - "+teacher);
    }

}
