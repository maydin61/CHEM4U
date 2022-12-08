package day_21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

import static java.util.Arrays.*;

public class arrayUtility2_copyOf {
    public static void main(String[] args) {
        String[] students = {"Halid", "Hafsa", "Hamza", "aydin", "Istanbul", "Samsun", "Trabzon"};
        String[] newStudents = {"Aydin"};
        String[] list = copyOf(students, 2);
        System.out.println(Arrays.toString(list));
        System.out.println(list[0] + " " + list[1]);
        String[] list2 = Arrays.copyOf(newStudents, 1);
        System.out.println(Arrays.toString(list2));
        String[] list22 = Arrays.copyOfRange(students, 2, 6);
        System.out.println(Arrays.toString(list22));

        int[] numbers = {1, 2, 3, 4, 5, 46, 7, 57, 757, 7};

        numbers = Arrays.copyOf(numbers, 9);
        System.out.println(Arrays.toString(numbers));

        int[] nmb = Arrays.copyOfRange(numbers, 5, 8);
        System.out.println(Arrays.toString(nmb));
        for (int each : nmb) {

            System.out.print(each + " - ");

        }
        char[] chars = {'A', 'B', 'c', 'D', 'F', 'g', 'l' };
                   char[] chars1 = Arrays.copyOfRange(chars, 2, 4 + 2);
            System.out.println("\n" + Arrays.toString(chars1));   // similar with substring method starts end
            // not included the last given number
            int[] scores = {20, 40, 56, 57, 75, 77, 45, 23, 90, 56};
            int[] result = Arrays.copyOfRange(scores, 4, 7);

            System.out.println(Arrays.toString(result));
            Arrays.sort(scores);
            System.out.println(Arrays.toString(scores));


            // how to split a sentence to words
        String str = "Hi how are you welcome to Tutorials point";
        String words[] = str.split(" ");
        for (String token : words) {
            System.out.println(token);
        }
    }
}