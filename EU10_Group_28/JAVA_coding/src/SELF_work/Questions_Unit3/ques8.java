package JAVA_coding.src.SELF_work.Questions_Unit3;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] a= new int[size];
        int i=0;
        while (i<size){
            a[i++] = input.nextInt();
        }
        mth8(a);
    }
    public static int[] mth8(int [] arr){
        for (int n:arr) {
            if (n % 4 == 0) {
                continue;
            }
            System.out.println(n);
        }
        return arr;

    }
}
