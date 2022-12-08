package week11_19_11_2022;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArayList2removeNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9,10));
        System.out.println(numbers);
        divisibleBy3(numbers);
        divisibleBy2(numbers);
        divisibleBy4(numbers);
        divisibleBy5(numbers);

    }
    public static ArrayList<Integer> divisibleBy3(ArrayList<Integer> numbers) {
        ArrayList<Integer> numberS = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 3 == 0) {
                numberS.add(number);
            }
        }
        System.out.println(numberS);
        return numberS;
    }
    public static ArrayList<Integer> divisibleBy2(ArrayList< Integer> numbers){
        ArrayList<Integer> numberS = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                numberS.add(number);
            }
        }
        System.out.println(numberS);
        return numberS;
    }
    public static ArrayList<Integer> divisibleBy4 ( ArrayList<Integer> numbers){
        ArrayList<Integer> numberS = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 4 == 0) {
                numberS.add(number);
            }
        }
        System.out.println(numberS);
        return numberS;
    }
    public static ArrayList<Integer> divisibleBy5(ArrayList<Integer> numbers){
        ArrayList<Integer> numberS = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 5 == 0) {
                numberS.add(number);
            }
        }
        System.out.println(numberS);
        return numberS;
    }

}
