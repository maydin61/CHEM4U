package TasksGeneral_from_65_;

import java.util.Scanner;

public class reverse_It_3_067 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.length() > 5) {
            System.out.println("too long!");

        } else if (word.length() < 4) {
            System.out.println("too short!");

        } else {
            System.out.println("" + word.charAt(4) +
                    word.charAt(3)
                    + word.charAt(2)
                    + word.charAt(1)
                    + word.charAt(0));
        }
    }
}