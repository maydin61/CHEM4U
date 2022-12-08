package day27_WrapperClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class replaceAll {
    public static void main(String[] args) {
        int [] arr1={10,10,20,20,30,40,30,40,30};
        arr1=replaceAll(arr1,20,200);
        System.out.println(Arrays.toString(arr1));

        double [] arr2={1.0,1.0,2.0,2.0,3.0,4.0,3.0,4.0,3.0};
        arr2=replaceAll(arr2,2.0,20.3);
        System.out.println(Arrays.toString(arr2));

        char [] arr3={'a','C','a','D','a'};
        arr3=replaceAll(arr3,'a','C');
        System.out.println(Arrays.toString(arr3));

    }
    //  UtilityClass.replace all (array , element, newElement)
    public static int [] replaceAll(int [] array,int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i]= newElement;
            }
        }
        return array;
    }
    public static double[] replaceAll(double[] array,double oldElement, double newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i]= newElement;
            }
        }
        return array;
    }
    public static char[] replaceAll(char[] array,char oldElement, char newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i]= newElement;
            }
        }
        return array;
    }
}
