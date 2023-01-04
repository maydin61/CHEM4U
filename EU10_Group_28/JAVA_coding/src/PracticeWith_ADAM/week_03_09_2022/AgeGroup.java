package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        System.out.println("Please enter your age to find out your age group.");
        Scanner scan=new Scanner(System.in);
        Integer ageGroup= scan.nextInt();

        String text=" ";

        if (ageGroup>=85){
            text="Old Senior Citizen 85+";
                 } else if (ageGroup>74 ) {
            text="Senior Citizen";
                } else if (ageGroup>44 || ageGroup<75) {
            text="Senior Citizen";
                  } else if (ageGroup>54 || ageGroup<65) {
            text="Young Senior Citizen";
                } else if (ageGroup>49 || ageGroup<55) {
            text="Middle-Aged Adult";
              } else if (ageGroup>39 || ageGroup<50) {
            text="Young Middle-Aged Adult";
                } else if (ageGroup>20 || ageGroup<40) {
            text="Adult";
              } else if (ageGroup>18 || ageGroup<21) {
            text="Young Adult";
             } else if (ageGroup>12 || ageGroup<18) {
            text="Teenager ";
             } else if (ageGroup>9 || ageGroup<13) {
            text="Pre-Teen";
             } else if (ageGroup>5 || ageGroup<10) {
            text="Kid";
             } else if (ageGroup>2 || ageGroup<6) text = "Toddler ";
            else System.out.println(text);{
            System.out.println(text);
        }
    }
}
