package day25_Utilities_Custom_Method_Overlaoding;

public class day25_sumOfTwoNumbers {
    private static int sumOfTwoNumbers;

    public static void main(String[] args) {

        int sum2 = sumOfNumbers(10,39);
        System.out.println("sum2 = " + sum2);

        int sum3= sumOfNumber(12,14,16);
        System.out.println("sum3 = " + sum3);

        int sum4=sumOfNumber(3,6,9,12);
        System.out.println("sum4 = " + sum4);
    }
    public static int sumOfNumbers(int nmb1 , int nmb2){

        return nmb1+nmb2;
    }
    public static int sumOfNumber(int nmb1, int nmb2, int nmb3){
        return (nmb1+nmb2+nmb3);
    }
    public static int sumOfNumber(int nmb1, int nmb2, int nmb3, int nmb4) {
        return (nmb1 + nmb2 + nmb3 + nmb4);

    }

}
