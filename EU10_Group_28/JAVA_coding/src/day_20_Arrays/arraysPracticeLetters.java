package day_20_Arrays;

import java.util.Arrays;

public class arraysPracticeLetters {
    public static void main(String[] args) {
        char[] letters = new char[26];

        //  letters [0]='A';
        //  letters [1]='B';

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {  // i and j used to index of and letters
            letters[j] = i;

        }
        System.out.println(Arrays.toString(letters));

        char ch = 'a';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters));

        char ch1 = 'Z';
        for (int i = 0; i >= letters.length-1; i++) {
            letters[i] = ch1;
            ch1++;
        }
        System.out.println(Arrays.toString(letters));
    }
}