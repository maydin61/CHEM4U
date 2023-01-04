package JAVA_coding.src.MUHTAR_Practice.day25_Utilities_Custom_Method_Overlaoding;

import JAVA_coding.src.PracticeWith_ADAM.UtilityClass.removeDoublicatedString;

public class test {
    public static void main(String[] args) {

       String str="Java";

       String newString = day_25_reverseString.reverseString(str);
       System.out.println(newString);

       String newStringEach = day_25_reverseString.printEachCharacter(str);
        System.out.println(newStringEach);

        String str1="Tahta kasik";
        String result;
        result =day_25_reverseString.reverseString(str1);
        System.out.println(result);

        String str4="dkddkkeeekeek334444";
        String rsl4 = removeDoublicatedString.removeDoublicated(str4);
        System.out.println(rsl4);


        int [] arr45={12,34,56,34,4};
        System.out.printf("", reverseArrayValues.reverseArrayValue(arr45));

    }
}
