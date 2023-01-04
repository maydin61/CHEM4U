package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class multiDimentionalArrays {
    public static void main(String[] args) {
        int [] [] array2D = {{1,2,3,4},{2,4,6,8,10}};

        int [][] array3D = {{5,6,7,8,9},{12,14,16,18},{3,16,19,12,15},{45,345,535,5,5345}};

        System.out.println(Arrays.toString(array2D[0]));
        System.out.println(Arrays.toString(array2D[1]));
        System.out.println(Arrays.toString(array3D[1]));

        System.out.println("======== 111");
        System.out.println(Arrays.deepToString(array2D));

        System.out.println("========2222");
        System.out.println(Arrays.toString(new int[]{array2D[1][1]}));
        System.out.println(Arrays.toString(new int[]{array2D[0][0]}));

        System.out.println("=====3333");
        System.out.println(Arrays.toString(new int[]{array3D[1][1]}));

        System.out.println(Arrays.toString(new int[]{array3D[2][1]}));

    }
}
