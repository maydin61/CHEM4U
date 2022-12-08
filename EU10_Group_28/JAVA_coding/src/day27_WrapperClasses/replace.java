package day27_WrapperClasses;

import java.util.Arrays;

public class replace {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};  // UtilityClass.replace with index2 ==> 30

                arr = replaceElement(arr,2,30);
        System.out.println(Arrays.toString(arr));

        boolean [] arr2={true,true,false,false};
            arr2 = replaceElement(arr2,1,false);
        System.out.println(Arrays.toString(arr2));

        double [] arr3={1.2,2.2,3.4,4.6,5.5};  // UtilityClass.replace with index2 ==> 30

        arr3 = replaceElement(arr3,2,9.9);
        System.out.println(Arrays.toString(arr3));

        String  [] arr4={"Java", "Python", "C##"};
        arr4 = replaceElement(arr4,1,"JavaScrip");
        System.out.println(Arrays.toString(arr4));


    }   //UtilityClass.replace with index2 ==> 30
    public static int [] replaceElement(int [] array, int index, int newElement){

        if ( index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index ]= newElement;
        return array;
    }
    public static boolean [] replaceElement(boolean [] array, int index, boolean newElement){

        if ( index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index ]= newElement;
        return array;
    }
    public static char [] replaceElement(char [] array, int index, char newElement){

        if ( index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index ]= newElement;
        return array;
    }
    public static double [] replaceElement(double [] array, int index, double newElement){

        if ( index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index ]= newElement;
        return array;
    }
    public static String [] replaceElement(String [] array, int index, String newElement){

        if ( index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index ]= newElement;
        return array;
    }
}
