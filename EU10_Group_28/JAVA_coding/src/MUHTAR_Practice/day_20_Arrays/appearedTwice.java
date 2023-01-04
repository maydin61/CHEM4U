package JAVA_coding.src.MUHTAR_Practice.day_20_Arrays;

import java.util.Arrays;

public class appearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'A', 'C', 'a', 'B' };


        for (int j = 0; j < chars.length; j++) {


            char ch = chars[j];

            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if (ch == chars[i]) {
                    frequency++;
                }
            }
            if (frequency == 2)
            System.out.println(ch);

        }
        System.out.println(Arrays.toString(chars));
    }
}