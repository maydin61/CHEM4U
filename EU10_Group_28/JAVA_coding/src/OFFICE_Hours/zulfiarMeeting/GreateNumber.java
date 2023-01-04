package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class GreateNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b) {
            System.out.println(a +" is greater ");
                }else if(a<b){
            System.out.println(b +" is greater ");
        }
    }
}
