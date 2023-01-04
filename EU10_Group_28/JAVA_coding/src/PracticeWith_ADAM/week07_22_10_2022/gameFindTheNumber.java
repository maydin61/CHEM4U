package JAVA_coding.src.PracticeWith_ADAM.week07_22_10_2022;

import java.util.Random;
import java.util.Scanner;

public class gameFindTheNumber {
    public static void main(String[] args) {
       /* -- Task 1: Find the number that given a hidden number between 1 and 100 randomly created.
        Hint:   Random random=new Random();
        int hiddenNumber = random.nextInt(100) + 1;
    */
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            Random random = new Random();
            int hiddenNumber = random.nextInt(10) + 1;
            System.out.println(hiddenNumber);
            break;
        /*    boolean flag=true;
        } do {
            System.out.println("enter a number");
            int searchedNumber = scanner.nextInt();
            if (searchedNumber == hiddenNumber){
                System.out.println("you found the number");
                flag=false;
            }else {
                System.out.println("try again");
            }
        }while ( int i=2);

*/
        }

    }
}