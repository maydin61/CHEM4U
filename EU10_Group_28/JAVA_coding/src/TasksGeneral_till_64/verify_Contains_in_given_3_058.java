package TasksGeneral_till_64;

import java.util.Scanner;

public class verify_Contains_in_given_3_058 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String letter=scanner.nextLine();
        String word=scanner.nextLine();
        String sentence=scanner.nextLine();


        System.out.println(sentence.contains(word));
        System.out.println(word.contains(letter));


        // checking the word in a sentences and give feedback as true or false
    }
}
