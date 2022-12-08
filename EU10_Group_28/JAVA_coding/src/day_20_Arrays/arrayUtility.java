package day_20_Arrays;

import java.util.Arrays;

public class arrayUtility {
    public static void main(String[] args) {
        int  numbers  [] = {1,3,5,0,6,7767,78};

        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbers).lastIndexOf(numbers.length));
        Arrays.stream(numbers).toArray();
        for (int each:numbers){

            System.out.print(each+", ");
        }
    }
}
