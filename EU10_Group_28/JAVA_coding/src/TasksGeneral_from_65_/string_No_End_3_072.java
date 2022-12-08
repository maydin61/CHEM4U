package TasksGeneral_from_65_;

import java.util.Scanner;

public class string_No_End_3_072 {
    public static void main(String[] args) {
        System.out.println("Enter a word or sentence");
        Scanner scanner=new Scanner(System.in);
        String text=scanner.next();
        int theLengthOfWord=text.length();
// system will do the operation for only the first combined string not the rest
        String exceptLastLetter=text.substring(0,theLengthOfWord-1);
        String exceptLastTwoLetter=text.substring(0,theLengthOfWord-2);
        String lastTwoLetter=text.substring(theLengthOfWord-2,theLengthOfWord-1);

        System.out.println(exceptLastLetter);
        System.out.println(exceptLastTwoLetter);
        System.out.println(lastTwoLetter);
    }
}
