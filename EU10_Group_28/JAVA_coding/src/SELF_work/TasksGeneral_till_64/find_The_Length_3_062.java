package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class find_The_Length_3_062 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a text");
        String textLength=scanner.next();

        System.out.println(textLength.length()); // count the number of letters in word only

        int charCount = textLength.length();
        int lastLetter=charCount-1;   // to conversion to last letter number (n-1), first letter starts from zero


        System.out.print(textLength.charAt(0)); // print first letter
        System.out.println(textLength.charAt(lastLetter));  // print last letter to first one

    }
}
