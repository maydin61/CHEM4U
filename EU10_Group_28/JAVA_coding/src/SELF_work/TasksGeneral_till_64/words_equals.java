package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class words_equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

       if (word1.equals(word2)) {
            System.out.println("word1 equals to word2");
        } else {
            System.out.println("word1 is not equals to word2");


        }

    }
}