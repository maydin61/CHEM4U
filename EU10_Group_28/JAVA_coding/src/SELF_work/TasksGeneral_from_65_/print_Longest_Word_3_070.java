package JAVA_coding.src.SELF_work.TasksGeneral_from_65_;

import java.util.Scanner;

public class print_Longest_Word_3_070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(word1.length()>word2.length() ? word1 : word2 ) ;

        /*if (word1.length() > word2.length()) {
            System.out.println(word1);
        } else if (word2.length() > word1.length()) {
                     System.out.println(word2);
        } else {
        } System.out.println("Thr words have the length");

         */
    }
}