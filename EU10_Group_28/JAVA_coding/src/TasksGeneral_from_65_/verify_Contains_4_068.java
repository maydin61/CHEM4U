package TasksGeneral_from_65_;

import java.util.Scanner;

public class verify_Contains_4_068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String sentence=scanner.nextLine();
        // contain method of String
        boolean result= (sentence.contains(word));

        System.out.println(result);
    }
}
