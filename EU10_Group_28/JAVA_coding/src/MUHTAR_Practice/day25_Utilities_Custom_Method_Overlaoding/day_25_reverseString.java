package JAVA_coding.src.MUHTAR_Practice.day25_Utilities_Custom_Method_Overlaoding;

public class day_25_reverseString {
    private static String printEachCharacter;

    public static void main(String[] args) {

        String str1 = "Aydin";
        str1 = reverseString(str1);
        System.out.println(str1);

    }

    public static String reverseString(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);

        }

        return reverseString;

    }

    public static String printEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        return printEachCharacter;
    }
}
