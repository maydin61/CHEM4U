package TasksGeneral_from_65_;

import java.util.Scanner;

public class merge_them_3_066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        if (word1.length() != 3 || word2.length() != 3) {
            System.out.println("can not merge");
        } else {
        }
        System.out.println(""+word1.charAt(0)+""+word2.charAt(0)+
                           "\n"+word1.charAt(1)+word2.charAt(1)+
                           "\n"+word1.charAt(2)+word2.charAt(2));
    }
}