package day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class splitToWords_Arrays {
    public static void main(String[] args) {
       String sentence = "Today is Java day try to learn Java";
       String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reverseSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
          reverseSentence += words[i]+" ";
        }
        System.out.println(reverseSentence);
    }
 }

