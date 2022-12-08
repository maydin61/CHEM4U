package day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class multidiamnetionalArrays {
    public static void main(String[] args) {
        int [] [] array2D = {{1,2,3,4},{0,34,6,8,10}};

        int [][] array3D = {{5,6,7,8,9},{12,14,16,18},{3,16,19,12,15},{45,345,535,5,5345}};

        System.out.println("array2D = " + Arrays.deepToString(array2D));
        System.out.println("array3D = " + Arrays.deepToString(array3D));
        System.out.println("======111");
        // i indicate single dimensional of array
        for (int i = 0; i < array2D.length; i++)
            System.out.println(Arrays.toString(array2D[i]));
        System.out.println("=====222");

        for (int i = 0; i < array3D.length; i++) {
            System.out.println(Arrays.toString(array3D[i]));

        }
        System.out.println("=======3333");
        for (int i = array2D.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(array2D[i]));
        }
        System.out.println("====4444");
        int each;
        for (int i = array3D.length - 1; i >= 0; i--) {
             System.out.println(Arrays.toString(array3D[i]));

        }
        System.out.println("=======5555");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j< array2D.length; j++) {
               // System.out.print(Arrays.toString(new int[]{array2D[i][j]})+"");
                System.out.print(array2D[i][j]+" ");  // without  [ ] break
            }
            System.out.println();  // to give extra line
            }
        }
    }
