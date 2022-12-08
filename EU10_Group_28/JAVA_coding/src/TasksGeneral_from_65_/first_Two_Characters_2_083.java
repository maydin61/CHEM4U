package TasksGeneral_from_65_;

import java.util.Scanner;

public class first_Two_Characters_2_083 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a text");
        String text=scan.next();
        // beginningIndex   endingIndex
        System.out.println(text.substring(0,2));

    }
}
