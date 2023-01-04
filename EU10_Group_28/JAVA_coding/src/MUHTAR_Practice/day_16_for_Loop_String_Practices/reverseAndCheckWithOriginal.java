package JAVA_coding.src.MUHTAR_Practice.day_16_for_Loop_String_Practices;

public class reverseAndCheckWithOriginal {
    public static void main(String[] args) {
        String word="Anna";
        String reverse="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
       boolean isPalindrome = word.equalsIgnoreCase(reverse);
        System.out.println(reverse);
        System.out.println("word is palindrome or Not: "+isPalindrome);
    }
}
