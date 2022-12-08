package TasksGeneral_till_64;

import java.util.Scanner;

public class ternaryOperator_01_3_060 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();

        int display=(number>=5) ? number : -number;

        System.out.println(display);
        System.out.println("==========================");
        System.out.println ((number>=5) ? number : -number);



    }
}
