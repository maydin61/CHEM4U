package day_20_Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class findingMaxNumberInArray {
    public findingMaxNumberInArray(int[] numbers) {
    }

    public static void main(String[] args) {
        int numbers []  ={20,34,56,757,7,65,5,56,7,9878};

        int max = numbers[0];   // first number assume as the biggest



        for (int i = 0; i < numbers.length; i++) {    // array name.fori give automatically loop
            if (numbers[i]> max){
                max=numbers[i];
            }
      //      for (int i1 = numbers.length - 1; i1 >= 0; i1--) {  // reverse way of loop  array.forr
       }System.out.println(max);
        OptionalInt maxNumber = Arrays.stream(numbers).max();
        OptionalInt minNumber = Arrays.stream(numbers).min();
        System.out.println(Arrays.toString(new OptionalInt[]{maxNumber}));
        System.out.println(Arrays.toString(new OptionalInt[]{minNumber}));
    }
}

