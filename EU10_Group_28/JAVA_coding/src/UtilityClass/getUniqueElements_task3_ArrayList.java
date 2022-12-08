package UtilityClass;

import java.util.ArrayList;

public class getUniqueElements_task3_ArrayList {
    public static void main(String[] args) {

        int[] first1 = {1, 2, 3, 4, 5,2,3};
        int[] second2 = {4, 5, 6,7,5};
        getUniqueElements(first1,second2);


        String [] str1={"Ali", "veli", "Veli","Ali"};
        String [] str2={"Aydin", "Halid", "Hafsa","Hamza","Muhammet","Hamza"};
        getUniqueElementsString(str1,str2);




    }

    public static ArrayList<Integer> getUniqueElements(int[] first, int[] second) {

        //ArrayList<Integer> result = new ArrayList<>(Arrays.asList(first));
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : first) {
            if ( ! result.contains(i))
            result.add(i);   // eleminate the similar elements
        }
        for (int j : second) {
            if ( ! result.contains(j))   // eliminate the similarity in list
            result.add(j);
        }
        System.out.println(result);
        return result;
    }
    public static ArrayList<String> getUniqueElementsString(String [] first, String [] second){
        ArrayList<String > result = new ArrayList<>();
        for (String i : first) {
            if ( ! result.contains(i))
                result.add(i);   // eleminate the similar elements
        }
        for (String j : second) {
            if ( ! result.contains(j))   // eliminate the similarity in list
                result.add(j);
        }
        System.out.println(result);
        return result;
    }
}
/*
Task 3 :

Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6
 */