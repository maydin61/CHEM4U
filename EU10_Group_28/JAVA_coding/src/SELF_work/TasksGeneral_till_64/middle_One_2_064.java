package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class middle_One_2_064 {
    public static void main(String[] args) {
        System.out.println("Enter a word to find the length or middle value");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int charCount = word.length();

        if (charCount == 1) {
            System.out.println(word + word + word);

        } else if (charCount == 2) {
            System.out.println(word + word);

        } else if (charCount >= 3) {
            // 01234     5/2 ==> 1 remainder ,
            // hello
            int middleIndex = charCount / 2;
            if (charCount % 2 == 1) {   // odd number situation
                System.out.println(word.charAt(middleIndex));

            } else {
                // 012345     6/2 ==> 0 remainder ,
                // wonder        even number
                System.out.println(word.charAt(middleIndex - 1) + "" +
                        word.charAt(middleIndex));


            }
        }
    }
}