package TasksGeneral_from_65_;

import java.util.Scanner;

public class duplicate_It_3_065 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word1=scanner.next();
        String word2= scanner.next();
        System.out.println(word1+word2+word1);
        System.out.println(word1.concat(word2).concat(word1).concat(word2));
    }
}
