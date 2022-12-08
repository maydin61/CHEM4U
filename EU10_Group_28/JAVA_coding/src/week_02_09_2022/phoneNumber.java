package week_02_09_2022;

import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Area Code");int areaCode= scan.nextInt();
        System.out.println("Local Number");int localNumber= scan.nextInt();
        String phoneNumber="("+areaCode+")"+" "+localNumber;
        System.out.println("Calling Number "+phoneNumber);
    }
}
