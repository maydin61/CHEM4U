package JAVA_coding.src.MUHTAR_Practice.day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueElementInArrayListWithCollectionMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,3,4,2,4,5,4,3,1,2,1,2,3,45,6,6,4,2,2,1,9,7,8));

        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer element : list) {
            int frequency = Collections.frequency(list, element);
            if (frequency == 1) {
                unique.add(element);
            }
        }
        System.out.println("unique = " + unique);


        System.out.println("-----------------");

        ArrayList<Integer> unique2 = new ArrayList<>();

        unique2.addAll(Arrays.asList(10,21,32,30,40,20,40,50,40,30,10,20,19,20,8));

        unique2.removeIf(each ->  Collections.frequency(unique2,each) >1 );
        System.out.println("unique2 = " + unique2);
        unique2.removeIf(each ->  Collections.frequency(unique2,each) !=1 ) ;
        System.out.println("unique2 = " + unique2);


    }
}
