package week09_05_11_2022;

public class task_07_in1020 {
    public static void main(String[] args) {
        integerBetween1020(12,99);
    }

    private static void integerBetween1020(int intrgrNumer1, int intgrNumber2) {

        int [] [] numbers = {{82,45},{34,56},{6456,9}};
        for (int[] number1D : numbers) {
            for (int element : number1D) {
                if (element>=10 || element<=20){
                    System.out.println(true);
                }else {
                    System.out.println(false);
                }
            }
        }

    }
}
/*
 Task 7 : Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
              in1020(8, 99) → false
 */