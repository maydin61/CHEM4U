import java.util.Arrays;
import java.util.Scanner;

public class MeetingOne {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        int[] numbers = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int [] number={3,-90,78,345,8};
        Arrays.sort(numbers);
        Arrays.sort(number);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[4]);
        System.out.println(number[0]);
        System.out.println(Arrays.stream(numbers).max());
        System.out.println(Arrays.stream(number).min());

    }

}