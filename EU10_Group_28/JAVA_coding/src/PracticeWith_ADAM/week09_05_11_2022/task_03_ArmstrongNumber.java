package JAVA_coding.src.PracticeWith_ADAM.week09_05_11_2022;

public class task_03_ArmstrongNumber {
    public static void main(String[] args) {

        armstrongNumber(12);
        armstrongNumber(370);


    }

    private static void armstrongNumber(int number) {
        int sum=0, digit,armstrongNumber, exponent=0,base=3;
       while(number > 0)
        {                                 //finds the last digit of the given number
            digit = number % 10;           //adds last digit to the variable sum
            exponent = exponent + digit;            //removes the last digit from the number
            number = number / 10;
        }
        System.out.println("Sum of digits: "+exponent);
        long result=1;      // result taken as 1 because not affect the result in multiplication
        while (exponent !=0){
            result *=base;
            exponent--;
        }
        System.out.println("Exponential of number three by digit :"+result);
        if (result == number){
            System.out.println("number is Armstrong number");
        }else{
            System.out.println("number is NOT Armstrong number");
        }
    }
}
/*
Task 3 :   Write a method that can check if a number is Armstrong number
          Note: if I have a 3-digit number then each of the digits is raised to the power of three and added
          to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
          Armstrong numbers are     === 153 370 371 407 === for 3 digits
 */