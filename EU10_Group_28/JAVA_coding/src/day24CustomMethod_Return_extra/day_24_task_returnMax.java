package day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day_24_task_returnMax {

    public static void main(String[] args) {

        int [] numbers={10,20,122,45,7,89,2,34,-9};

        Arrays.sort(numbers);

        int length=numbers.length;
        int maxNumber=numbers[length-1];

        System.out.println(maxNumber);


    }





 public static void returnMaxNumber(int [] number){
     int [] numbers={10,20,122,45,7,89,2,34,-9};
     Arrays.sort(numbers);
     int length=numbers.length;
     int maxNumber=numbers[length-1];
     System.out.println(maxNumber);

 }
}
/*
	2. create a method that can return the maximum number from an array of integers
 */