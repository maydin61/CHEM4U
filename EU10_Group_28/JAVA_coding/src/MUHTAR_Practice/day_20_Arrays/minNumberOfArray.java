package JAVA_coding.src.MUHTAR_Practice.day_20_Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class minNumberOfArray {
    public static void main(String[] args) {
        int [] numbers ={4,6,78,-90,34,1,123};

        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minNumber>numbers[i]){
                minNumber = numbers[i];
            }
        }
        OptionalInt minNumber2 = Arrays.stream(numbers).min();
        System.out.println(minNumber);
        System.out.println("====");
        System.out.println(minNumber2);
        Arrays.sort(numbers);
        int lastCharacter=numbers.length;
        System.out.println(numbers[lastCharacter-1]);

    }
}
