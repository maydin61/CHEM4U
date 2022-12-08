package week_4_09_2022;

import java.util.Scanner;
import java.util.SortedMap;

public class Nested_If_Statement {
    public static void main(String[] args) {

        boolean hasId = true;

        if (hasId = true)
        { System.out.println("enter the age");
            Scanner scan = new Scanner(System.in);
            Integer age = scan.nextInt();

            if (age >= 21) {
            } System.out.println("can NOT buy");
        } else { System.out.println("CAN ");
        }
    }
}



