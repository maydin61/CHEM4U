package zulfiarMeeting;

import java.util.Scanner;

public class Citizen_02_35 {
    public static void main(String[] args) {
        int age, seniorCitizen, nonSeniorCitizen;
        System.out.println("Enter the current count of seniorCitizen and nonSeniorCitizen:");
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        seniorCitizen = scan.nextInt();
        nonSeniorCitizen = scan2.nextInt();
        System.out.println("What is the age of new citizen");
        Scanner scan3=new Scanner(System.in);
        age = scan3.nextInt();
        if (age>=65){
            System.out.println("Senior Citizen");
            seniorCitizen++;
                    }else {
                             System.out.println("Non-Senior Citizen");
                             nonSeniorCitizen++;
                                                 }
        System.out.println("New Senior citizen count :"+seniorCitizen);
        System.out.println("New Non-Senior citizen count :"+nonSeniorCitizen);






    }
}
        /* if age is more than or equals to 65, Senior citizen and increase
        the number of senior citizen by one
        if age is less 65, non-Senior citizen and increase
        the number of non-senior citizen by one
         */
        /*
        System.out.println("");
         */
