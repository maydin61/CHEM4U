package JAVA_coding.src.PracticeWith_ADAM.week8_29_10_2022;

import java.util.Arrays;

public class task1_arrays {
    public static void main(String[] args) {
        int [] x={1,2,3};            // 2,3,1
        int [] y ={17,12,10,8};     // 12,10,8,17
        int [] a= {7,0,0};          // 0, 0 7

        int temp=x[0];
        for (int i = 0; i <x.length-1 ; i++) {   // ???? be care full about here
            x[i]=x[i+1];

        }
        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));

        for (int j = 0; j < y.length-1; j++) {
            y[j]=y[j+1];
        }
        y[y.length-1]=temp;
        System.out.println(Arrays.toString(y));

        for (int i = 0; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        System.out.println(Arrays.toString(a));
    }
}
