package day_13;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner=new Scanner(System.in);
        int yourAge= scanner.nextInt();
                System.out.println("Enter your gender");
                 Scanner scanner1=new Scanner(System.in);
                String gender=scanner1.next();
        System.out.println("Enter your full name");
        Scanner scanner2=new Scanner(System.in);
        String fulName=scanner2.next();

             System.out.println("Enter your phone number");
            Scanner scanner3=new Scanner(System.in);
            long phoneNumber=scanner3.nextLong();
        System.out.println("Enter your zip code ");
        Scanner scanner4=new Scanner(System.in);
        int zipCode=scanner4.nextInt();
            System.out.println("Enter your School name ");
            Scanner scanner5=new Scanner(System.in);
            String schoolName=scanner5.next();
        System.out.println("Enter your city name");
        Scanner scanner6=new Scanner(System.in);
        String cityName=scanner6.next();
            System.out.println("Enter your state name");
            Scanner scanner7=new Scanner(System.in);
            String state=scanner7.next();
        System.out.println("Enter your building number");
        Scanner scanner8=new Scanner(System.in);
        int buildingName=scanner8.nextInt();
              System.out.println("Enter your Street name");
              Scanner scanner9=new Scanner(System.in);
              String streetName=scanner9.next();

        System.out.println("                   "+
                               fulName+"\n"+
                           "                 "+
                           yourAge+gender+"\n"+
                          "                  "+phoneNumber);
        System.out.println("                  Address:");
        System.out.println(streetName+"\n"+"                            "
        +buildingName+"                                "+"\n"+zipCode+
                "                       "+cityName+","+state);

    }
}
