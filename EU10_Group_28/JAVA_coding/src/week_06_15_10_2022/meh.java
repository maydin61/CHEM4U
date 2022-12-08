package week_06_15_10_2022;

import java.util.Scanner;

public class meh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        do {
            x = scanner.nextInt();
        } while (!(10 < x) || !(x < 20));
        System.out.printf("The number you entered is %s%n", x);
    }
}
