package UtilityClass;

import java.util.Arrays;

public class add_new_ElementTo_Array {
    public static void main(String[] args) {

        int [] array = {1,2,3,4};
        array = addNewElementToArray(array, 5);
        System.out.println("array = " + Arrays.toString(array));

        System.out.println("========");

        double [] array2= new double[]{1.5, 2.5, 3, 5, 5.5};
        array2 = addNewElementToArray(array2, 7.5);
        System.out.println("array2 = " + Arrays.toString(array2));

        System.out.println("---------");

        char[] arrayCh={'a','c','k','2','@','[','*'};
        arrayCh = addNewElementToArray(arrayCh,'!');
        System.out.println("arrayCh = " + Arrays.toString(arrayCh));

        System.out.println("++++++++");
        String [] names={"Aydin", "Almula","Hamza","Hafsa","Halid"};
        names= addNewElementToArray(names,"Muhammet");
        System.out.println("names = " + Arrays.toString(names));
        names= addNewElementToArray(names,"AhmedHamza");
        System.out.println("names = " + Arrays.toString(names));





    }
    public static int [] addNewElementToArray(int [] array, int element){  // returning to int array that is why int []
        int newArray [] = new int[array.length+1];
       int i=0;
        for (int each:array){
           newArray[i++] = each;
       }
        newArray[array.length]=element;  // added array index number for new element
        return newArray;
    }
    public static double [] addNewElementToArray(double [] array , double element){
        double [] newArray= new double [array.length + 1];
        int i=0;
        for (double each:array){
            newArray[i++]= each;
        }
        newArray[array.length]=element;  // added array index number for new element
        return newArray;
    }
    public static char[] addNewElementToArray(char [] arrayChar, char element){
        char [] newArray= new char[arrayChar.length+1] ;
        int i=0;
        for (char each:arrayChar){
            newArray[i++]= each;
        }
        newArray[arrayChar.length]=element;  // added array index number for new element
        return newArray;

    }
    public static String[] addNewElementToArray(String [] arrayString, String element) {
        String[] newArray = new String[arrayString.length + 1];
        int i = 0;
        for (String each : arrayString) {
            newArray[i++] = each;
        }
        newArray[arrayString.length] = element;  // added array index number for new element
        return newArray;

    }
}
