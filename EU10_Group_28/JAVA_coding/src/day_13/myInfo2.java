package day_13;

import java.util.Scanner;

public class myInfo2 {
    public static void main(String[] args) {
            System.out.println("Enter your age"+"\n"+
                   "Enter your phone number"+"\n"+
                   "Enter your zip code "+"\n"+
                    "Enter your building number" );
        Scanner scanner=new Scanner(System.in);
        int yourAge= scanner.nextInt();
        long phoneNumber=scanner.nextLong();
        Scanner scanner4=new Scanner(System.in);
        int zipCode=scanner4.nextInt();
        int buildingName=scanner.nextInt();

             System.out.println("Enter your gender"+"\n"+
                     "Enter your full name"+"\n"+
                    "Enter your School name"+"\n"+
                     "Enter your city name"+"\n"+
                     "Enter your state name"+"\n"+
                     "Enter your Street name");
        Scanner scanner1=new Scanner(System.in);
        String gender=scanner1.next();
        String fulName=scanner1.next();
        String schoolName=scanner1.next();
        String cityName=scanner1.next();
        String state=scanner1.next();
        String streetName=scanner1.next();

        System.out.println("\t\t\t\t\t\t\t"+
                                                     fulName+"\n"+
                           "\t\t\t\t\t\t\t"+
                                                     yourAge+gender+"\n"+
                           "\t\t\t\t\t\t\t"    +phoneNumber);
        System.out.println("\t\t\t\t\t\t\t"+"Address:");
        System.out.println(streetName+"\t\t\t\t\t\t\t\t\t\t"+"                            "
                        +buildingName+"\t\t\t\t\t\t\t\t\t\t"+"\n"
                             +zipCode+"\t\t\t\t\t\t\t\t\t\t"+cityName+","+state);
        System.out.println("\t\t\t\t\t\t\t"+schoolName);
    }
}
