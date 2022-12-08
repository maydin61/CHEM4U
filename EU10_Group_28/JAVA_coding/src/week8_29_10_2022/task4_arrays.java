package week8_29_10_2022;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task4_arrays {
    public static void main(String[] args) {
        String[] words = {"java", "longer world", "civic", "apple", "racecar", "mom", "anna"};
        // int counter=0;
        String wordsLongest="";
        for (String eachWord : words) {
    boolean isPalindrome=true;
            String longestPalindrome="";
            String smallestPalindrome="";
                for (int i = 0; i < eachWord.length()/2 ; i++) {
                char chFromLeft=eachWord.charAt(i);
                char chFromRight=eachWord.charAt( eachWord.length()-i-1 );
                //char ch3=each.charAt(each.length()-i-2);

                if ( chFromLeft != chFromRight ){
                    isPalindrome=false;
                    break;


                }
            }
            if ( isPalindrome && eachWord.length() > longestPalindrome.length() ){
                longestPalindrome=eachWord;
                String [] longest={longestPalindrome};
                System.out.print(longestPalindrome+" ");
                System.out.println("");
                System.err.print(Arrays.toString(longest));
/*
                for (String theLongest : longest){
                    if(theLongest.length()>=longest.length) {
                        theLongest= String.valueOf(longest);
*/
                    }
                    //System.out.println(theLongest);
                }
            }
           // System.out.print(Array.toString(longest));
        }
