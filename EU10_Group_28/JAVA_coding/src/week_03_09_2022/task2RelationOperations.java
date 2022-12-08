package week_03_09_2022;

import java.util.Scanner;

public class task2RelationOperations {
    public static void main(String[] args) {

        int x=2;
        int y=23;
        boolean result1=true;
        boolean result2=false;
            if (result1 = ++x<y){
            System.out.println("x = " + x);
        }else if (result1&& ++x<y) {
                System.out.println("x = " + x);
            }else if (result1& ++x<y) {
                System.out.println("x = " + x);}
        boolean xIsBiggerThanY= x>y;
        boolean xIsEqualsToy= x==y;
        System.out.println(xIsBiggerThanY);
        System.out.println(xIsEqualsToy);
        if (xIsBiggerThanY==false){
            System.out.println("x+y ="+(x+y));
        }

    }
}
