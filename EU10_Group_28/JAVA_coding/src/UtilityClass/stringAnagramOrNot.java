package UtilityClass;

import java.util.Arrays;

public class stringAnagramOrNot {
    private static boolean anagram;

    public static void main(String[] args) {

        String str12="maydi";
        String str13="adiny";
        boolean result =  anagram(str12,str13);
        System.out.println(result);
    }

    public static boolean anagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("anagram");
            return anagram;
        }else {

        }
        return false;
    }
}



