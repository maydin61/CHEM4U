package JAVA_coding.src.PracticeWith_ADAM.UtilityClass;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeTwoArrays_ArrayList {
    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList <Integer> first1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList <Integer> second2 = new ArrayList<>(Arrays.asList(4,5,6));

        // int [] results= new int [first1.size()+second2.size()];



        int [] merge= mergeTwoArray(first1, second2);
        System.out.println(Arrays.toString(merge));
    }
    public static int [] mergeTwoArray(ArrayList <Integer> first, ArrayList<Integer> second){
        int [] result= new int [first.size()+second.size()];
        int index =0;
        for (Integer each:first){
            result[index++]=each;
        }
        for (Integer each:second){
            result[index++]=each;
        }

        return result;
    }





}
/*
Task 2 :

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:

first arraylist :1,2,3

second arraylist :4,5,6

output:

1,2,3,4,5,6
 */