package week8_29_10_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraysIntro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // if we know the element of arrays
        int [] arrayName={1,2,3,4,5,6 };
        // if we do not know the elements, we have to know the length of array, size of elements
        // new key-word
        int [] array=new int[6];  // [6] space[10] to store data in memory
        array[0]=1;
        array[1]=12;
        array[2]=123;
        array[3]=1234;
        array[4]=12345;
        array[5]=123456;
        // how to print elements
        System.out.println(array[4]);
        char [] letters={'a','b','D','F'};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(letters));
        System.out.println(letters[1]);
        System.out.println(letters[3]);

        boolean [] arrays=new boolean[3];
      //  arrays [0]=1;
        arrays [1]=false;
        arrays [2]=true;
        double [] doubles=new double[2];
        doubles[1]=10;

        // sort method is sorting elements to small to big or ......
                      //0123456789 10
        int [] numbers={3,22,10,678,77,98};
        System.out.println(Arrays.toString(numbers).substring(9));
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("after sorting ======");
        System.out.println(Arrays.toString(numbers));

        int[] array4={2,4,6};
        int[] array5={2,6,4};
        System.out.println(array4);
        System.out.println(array5);
        System.out.println(Arrays.equals(array4,array5));
        Arrays.sort(array5);
        System.out.println("after sorting ====");
        System.out.println(Arrays.equals(array4,array5));
            //

    }
}
