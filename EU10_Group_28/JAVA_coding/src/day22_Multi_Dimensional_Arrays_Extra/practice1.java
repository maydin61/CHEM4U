package day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int i1 = 0; array[i].length - 1 >= i1; i1++) {

                System.out.print(Arrays.toString(new int[]{array[i][i1]}));
            }
        }
    }
}