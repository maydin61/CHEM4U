package week09_05_11_2022;

public class task_05 {
    public static void main(String[] args) {


        differenceBetweenNumber(23);
        System.out.println(differenceBetweenNumber(23));
        System.out.println(differenceBetweenNumber(12));
        System.out.println(differenceBetweenNumber(40));

    }

    private static int differenceBetweenNumber(int number21) {  // void changed to int because of data type
       // return (number21<21) ? -number21 : (number21-21)*2;

        int result = 0;

        if (number21 < 21) {
            result = 21 - number21;
        } else {
            result = (number21-21) * 2;

        }
        return result;
    }

}
/*
Task 5 :  Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)
    method  parameter : no , or what kind of data type --- integer
    method return type : void? --- integer


             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4
 */