package JAVA_coding.src.MUHTAR_Practice.day26_CustomMethodPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {

        int [] array= {2,4,6,8,10};
        int []    result = removeElement(array,2);
        System.out.println(Arrays.toString(result));

        int [] numbers = {10,20,30,40,50};
              numbers = removeElement(numbers,3);  // {10,20,30,50}
        System.out.println(Arrays.toString(numbers));
        numbers = removeElement(numbers,3);
        System.out.println(Arrays.toString(numbers));



    }                           // {1,2,3,4}          2
    public static int [] removeElement(int [] array, int index){
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
    }
    public static void removeElement2(int [] array2, int index2){

    }


}
