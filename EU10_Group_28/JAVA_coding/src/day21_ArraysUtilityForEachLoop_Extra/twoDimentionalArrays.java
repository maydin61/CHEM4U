package day21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

public class twoDimentionalArrays {
    public static void main(String[] args) {

        int [] firstArray = {1,2,3};
        int [] secondArray = {10,20,30,40};
        int [] thirdArray = {34,45,6,67,88,867};

        int [] [] twoDimentionalArray = {
                {1,2,3},
                {10,20,30,40},
                {34,45,6,67,88,867}
        };
        int [] [] array2D= {firstArray,secondArray,thirdArray};
        System.out.println(Arrays.toString(array2D));
        System.out.println(twoDimentionalArray[2][2]); //   value in 3rd one index of 2 / 3rd element

        for (int i = 0; i < twoDimentionalArray.length; i++) {
            for (int j = 0; j < twoDimentionalArray[i].length; j++) {
                System.out.print("\t");
                System.out.print(Arrays.toString(new int[]{twoDimentionalArray[i][j]}));
            }
            int [] [] [] array3D ={{ {1,2,3,4}, {5,6,7,8},},{{10,20}}, {{25,35,45}}};


          }

    }
}
