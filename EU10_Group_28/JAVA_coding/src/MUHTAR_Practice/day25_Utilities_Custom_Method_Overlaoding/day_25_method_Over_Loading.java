package JAVA_coding.src.MUHTAR_Practice.day25_Utilities_Custom_Method_Overlaoding;

import java.util.Arrays;

public class day_25_method_Over_Loading {
    public day_25_method_Over_Loading(int i, int i1, int i2) {
    }

    public static void main(String[] args) {
        int [] intArray={6,7,8,-4,9,-3};
        Arrays.sort(intArray);

        double [] doublesArray={12.5, 45.6,67.7};
        Arrays.sort(doublesArray);

        char [] charsArray = {'n','H', 'L','A', 'j'};
        Arrays.sort(charsArray);

        System.out.println("=====");
       int result = day25_sumOfTwoNumbers.sumOfNumber(12,34,56);
        System.out.println(result);
        char [] result1 = day25_add_new_ElementTo_Array.addNewElementToArray(charsArray,'R');
        System.out.println(result1);


    }

}
