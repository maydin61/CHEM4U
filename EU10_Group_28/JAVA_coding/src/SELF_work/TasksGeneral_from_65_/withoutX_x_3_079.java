package JAVA_coding.src.SELF_work.TasksGeneral_from_65_;

import java.util.Scanner;

public class withoutX_x_3_079 {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        // starts with x or X, print without, no value print the original

        String upperCase=word.toUpperCase();

        if (word.substring(0,1).toUpperCase().equals("x"));
        {
            word = word.substring(1);                     // word change to new one without first character

            //  if (word.substring(0,1).equalsIgnoreCase("x"));


        } int lastCharIndex=word.length()-1;
        String lastCharString=word.substring(lastCharIndex);
        if (lastCharString.equalsIgnoreCase("X")){
            word = word.substring(0,lastCharIndex);   // new word forms from the old one without value of XXX

        }
        System.err.println(word);
    }
}
