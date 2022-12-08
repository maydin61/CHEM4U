package week09_05_11_2022;

public class armstrongNumbers {
    public static void main(String[] args) {

        armstrongNumber(370);
        armstrongNumber(153);
        armstrongNumber(371);
        armstrongNumber(407);


    }

    private static void armstrongNumber(int number) {
        int sum=0, eachDigit,armstrongNumber, exponent=0,base=3;
        double result=0;
        while(number > 0) {                                 //finds the last digit of the given number
            eachDigit = number % 10;           //adds last digit to the variable sum
            exponent = eachDigit;            //removes the last digit from the number
            number = number / 10;

            double result1 = Math.pow(exponent, base);
            result+=result1;
        }
        System.out.println((int)result);


            /*
Task 3 :   Write a method that can check if a number is Armstrong number
          Note: if I have a 3-digit number then each of the digits is raised to the power of three and added
          to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
          Armstrong numbers are     === 153 370 371 407 === for 3 digits
 */

    }
}
