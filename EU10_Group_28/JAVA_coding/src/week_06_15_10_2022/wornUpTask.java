package week_06_15_10_2022;

import java.util.Scanner;

public class wornUpTask {
    public static void main(String[] args) {
        /*
        - Given a non-empty string like "Code" print a string like below output.

 *                                 Code → "C
                                            Co
                                            Cod
                                            Code"
 *                                 abc → "aababc"
 *                                 ab → "aab"

   String text="Code";
        int size=text.length();
        for (int i = 0; i <=size ; i++) {
            System.out.println(""+text.charAt(0)+text.charAt(i++));
         */
        System.out.println("Enter a word");
        Scanner scan=new Scanner(System.in);
        String word= scan.next();

     String temp="";
        for (int i = 0; i <word.length() ; i++) {
            String str=word.substring(0,i+1);
            System.out.print(str);

            // for "do while" loop run at least once a time
            // to find the word in sentence once a time you need to exit from loop, break loop
        }
    }






    }
