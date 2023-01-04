package JAVA_coding.src.MUHTAR_Practice.day27_WrapperClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class removeDoublicates {
    public static void main(String[] args) {
        int [] arr1={1,1,2,2,4,4,9,3,6};
        arr1=removeDoubles(arr1,1);
        System.out.println(Arrays.toString(arr1));
        int [] arr2 = Arrays.stream(arr1).distinct().toArray();  // remove doublicates
        System.out.println(Arrays.toString(arr2));




    }                        // {1,1,2,2,4,4,9,3,6}
    public static int  [] removeDoubles(int [] array,int index){
        int [] result = new int [array.length-1];
        int j=0;
        for (int each:array){
            if (each == array[index]){   // if the index of array is maching with the given index
                continue;          // skip the element in given index number
            }
            result[j++] = each;    // assigned to new array
        }
        return result;
            

    }
}
/*
public static int [] UtilityClass.removeElement(int [] array, int index){

     if (index <0 || index> array.length-1){
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        int [] result = new int [array.length-1];
        int j=0;
        for (int each:array){
            if (each == array[index]){   // if the index of array is maching with the given index
                continue;          // skip the element in given index number
            }
            result[j++] = each;    // assigned to new array
        }
        return result;
 */