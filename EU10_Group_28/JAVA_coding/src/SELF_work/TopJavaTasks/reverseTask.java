package JAVA_coding.src.SELF_work.TopJavaTasks;

import java.util.Arrays;

public class reverseTask {
    public static void main(String[] args) {

        String str = "Aydin";
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] reverseArr = new int[arr.length];
        // System.out.println("reverseArr = " + Arrays.toString(reverseArr));
        int j = arr.length - 1;
        // System.out.println(j);
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[j--];
        }
        System.out.println("reverseArr = " + Arrays.toString(reverseArr));

        System.out.println("-------------");

        String words = "apple banana kiwi";

        String[] wordS = words.split(" ");
        //System.out.println("wordS = " + Arrays.toString(wordS));

        String[] reverseWordS = new String[wordS.length];

        int k = wordS.length - 1;
        // System.out.println(k);
        for (int i = 0; i < wordS.length; i++) {
            reverseWordS[i] = wordS[k--];
        }
        System.out.println(Arrays.toString(reverseWordS));

        String string = "civvic";
        int i1 = string.length();
        int j1 = i1;
        boolean palindrome = false;
        for (int i = 0; i < i1 / 2; i++) {
            if (string.charAt(i) == string.charAt(j1 - i - 1)) {
                palindrome = true;
            } else {
                palindrome = false;
            }
        }
        System.out.println(string +" : "+palindrome);
        System.out.println("+++++++");

        int numbers = 1234321;
        String strNumbers = String.valueOf(numbers);
        System.out.println("strNumbers = " + strNumbers);

        int i11 = strNumbers.length();
        int j12 = i11;
        boolean palindrome1 = false;
        for (int i = 0; i < i11 / 2; i++) {
            if (strNumbers.charAt(i) == strNumbers.charAt(j12 - i -1)) {
                palindrome1 = true;
            } else {
                palindrome1 = false;
            }

        }
        System.out.println(palindrome1);


        int [] x  = {4, 781, 8, 99, 103};

        Arrays.sort(x);
        int l=x.length;
        System.out.println(Arrays.toString(new int[]{x[x.length-1]}));
        System.out.println("max number in set x = " + x[x.length - 1]);
        System.out.println("min number in set x = " + x[0]);
        System.out.println("2. max number in set x = " + x[x.length - 2]);
        System.out.println("2. min number in set x = " + x[1]);


    }
}
