package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class reverseArrays {
    public static void main(String[] args) {

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6, 7, 8}, {8, 9, 10, 12, 45}};


        for (int i = arr2d.length - 1; i >= 0; i--) {
            for (int i1 = 0; arr2d[i].length - 1 >= i1; i1++) {

                System.out.print(Arrays.toString(new int[]{arr2d[i][i1]}));
            }

            System.out.println("=======1");
        }
        for (int i = 0; arr2d.length - 1 >= i; i++) {
            for (int i1 = arr2d[i].length - 1;  i1 >= 0; i1--) {

                System.out.print(Arrays.toString(new int[]{arr2d[i][i1]}));
            }
            System.out.println("");
        }
    }
}