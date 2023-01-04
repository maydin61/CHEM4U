package JAVA_coding.src.PracticeWith_ADAM.week09_05_11_2022;

import java.util.Arrays;

public class task_06_replaceFirstWithLastCharater {
    public static void main(String[] args) {

        firstToLastChange("Cydeo");
        firstToLastChange("Muhammet");
        firstToLastChange("ba");





    }

    private static void firstToLastChange(String stringWord) {
        String [] str= new String[stringWord.length()];
        str [0] = String.valueOf(stringWord.charAt(stringWord.length()-1));
        str [stringWord.length()-1] = String.valueOf(stringWord.charAt(0));

        for (int i = 1; i <stringWord.length()-1 ; i++) {
            str [i] = String.valueOf(stringWord.charAt(i));
        }
        System.out.print(Arrays.toString(str));
        for (String element : str) {

            System.out.print(element);
        }


    }
}
/*
Task 6 : Write a method that return a new string where the first and last chars have been exchanged.

             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"

    Task 7 : Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false
 */