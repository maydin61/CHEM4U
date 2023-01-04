package JAVA_coding.src.MUHTAR_Practice.day25_Utilities_Custom_Method_Overlaoding;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class returnToMaxArrayValue {
    public static void main(String[] args) {
        int numbers [] = {90,4,23,-4,12,345};
        OptionalInt result = returnToMaxValueInArray(numbers);
        System.out.println("result = " + result);

        double [] doubleNumbers={2.3,54.6,7.8};
        OptionalDouble result2 = returnToMaxValueInArray(doubleNumbers);
        System.out.println("result2 = " + result2);
        long [] longArray={3_000,5_000_000};
        OptionalLong result3 = returnToMaxValueInArray(longArray);
        System.out.println(result3);
    }
    public static OptionalInt returnToMaxValueInArray(int [] intArray){
        Arrays.sort(intArray);
        OptionalInt maxValue = Arrays.stream(intArray).max();
        return maxValue;
    }
    public static OptionalDouble returnToMaxValueInArray(double [] intArray) {
        Arrays.sort(intArray);
        OptionalDouble maxValue = Arrays.stream(intArray).max();
        return maxValue;
    }
    public static OptionalLong returnToMaxValueInArray(long [] intArray) {
        Arrays.sort(intArray);
        OptionalLong maxValue = Arrays.stream(intArray).max();
        return maxValue;
    }
}
