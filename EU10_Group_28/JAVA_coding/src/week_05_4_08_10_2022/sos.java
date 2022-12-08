package week_05_4_08_10_2022;

import java.util.Scanner;

public class sos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        if (text.startsWith("red"))
            System.out.println("red");
        else if (text.startsWith("blue")) {
            System.out.println("blue");
        } else {
            System.out.println();
        }
    }

}