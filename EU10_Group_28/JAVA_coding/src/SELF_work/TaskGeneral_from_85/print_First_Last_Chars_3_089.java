package JAVA_coding.src.SELF_work.TaskGeneral_from_85;

import java.util.Scanner;

public class print_First_Last_Chars_3_089 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word= scan.next();
        int length=word.length();
        //System.out.print(word.substring(0,1));
       // System.out.println(word.substring(length-1));
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(length-1);

        int meh = 1 + 2;
        boolean aIsFirstLetter = firstLetter == 'a';
        boolean eIsLastLetter = lastLetter == 'e';
        System.out.println("Starts with a: "+aIsFirstLetter);
        System.out.println("Ends with e: "+eIsLastLetter);

    }
}
