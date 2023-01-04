package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class Android_Version_3_029 {
    public static void main(String[] args) {
        System.out.println("Enter the version of your Android system");
        Scanner scanner=new Scanner(System.in);
        double version = scanner.nextDouble();
        if(version==1.5){
            System.out.println("Cupcake");
        } else if (version==1.6) {
            System.out.println("Donot");
        } else if (version== 2.1) {
            System.out.println("Eclair");
        } else if (version==2.2) {
            System.out.println("Froyo");
        } else if (version==2.3) {
            System.out.println("Gingerbread");
        } else if (version==3.1) {
            System.out.println("Honeycomb");
        } else if (version== 4.0) {
            System.out.println("Ice cream sandwich");
        } else if (version== 9.0) {
            System.out.println("Pie");
        } else if ((version >= 4.1) && (version <= 4.33)) {
            System.out.println("Jelly Bean");
        }else if ((version >= 8.0) && (version <= 8.1)) {
            System.out.println("Oreo");
        }else if ((version >= 4.4) && (version <= 4.44)) {
            System.out.println("KitKat");
        }else if ((version >= 5.0) && (version <= 5.11)) { // && range verification x to y
            System.out.println("Lollipop");
        } else{
            System.out.println("Sorry , we do not have this version.");
        }
    }
}
