package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class forEachLoop_toGetSingle_ElementPrint {
    public static void main(String[] args) {

        int [] [] arr2d={{1,2,3},{4,5,6,7,8},{8,9,10,12,45,100}};

        for (int [] eachVariable : arr2d) {

            for (int eachOne:eachVariable){
                System.out.print(eachOne+" ");
            }
            System.out.println(Arrays.toString(eachVariable));
        }
    }
}
