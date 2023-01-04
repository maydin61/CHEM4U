package JAVA_coding.src.MUHTAR_Practice.day25_Utilities_Custom_Method_Overlaoding;

import java.util.Arrays;

public class reverseArrayValues {
    public static void main(String[] args) {
       int [] numbers = {3,6,9,12};
       int [] reverseResult =  reverseArrayValue(numbers);
       System.out.println(Arrays.toString(reverseResult));

       double [] doubleArray={1.2,3.4,6.4,8.5};
       double [] reverseDouble = reverseArrayValue(doubleArray);
       System.out.println(Arrays.toString(reverseDouble));

       char [] chars = {'R','@','!'};
       char [] reverseChars = reverseArrayValue(chars);
       System.out.println(Arrays.toString(reverseChars));

       String [] strings = {"Muhammet Aydin Constanta Romania!"};
       String [] reverseString = reverseArrayValue(strings);
       System.out.println("reverseString = " + Arrays.toString(reverseString));
    }
    public static int[] reverseArrayValue(int [] numbers){
        int [] reverseArray =new int[numbers.length];
        for (int i = numbers.length - 1,j=0; i >= 0; j++,i--) {
            reverseArray[i]=numbers[j];
        }
        return reverseArray;
    }
    public static double[] reverseArrayValue(double [] doublesNumbers){
        double [] reverseArray =new double[doublesNumbers.length];
        for (int i = doublesNumbers.length - 1,j=0; i >= 0; j++,i--) {
            reverseArray[i]=doublesNumbers[j];
        }
        return reverseArray;
    }
    public static char[] reverseArrayValue(char [] chs){
        char [] reverseArray =new char[chs.length];
        for (int i = chs.length - 1,j=0; i >= 0; j++,i--) {
            reverseArray[i]=chs[j];
        }
        return reverseArray;
    }
    public static String[] reverseArrayValue(String [] strings){
        String [] reverseArray =new String[strings.length];
        for (int i = strings.length - 1,j=0; i >= 0; j++,i--) {
            reverseArray[i]=strings[j];
        }
        return reverseArray;
    }
}
