package JAVA_coding.src.MUHTAR_Practice.Array_List_Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

public class swap_firstAndLAnd_ElementsInArrayList {
    public static void main(String[] args) {

        ArrayList <Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(2,4,6,8,9,20));
        swapElementsWithLastInArrayList(list);


        ArrayList <Integer> list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int max = max(list2);
        System.out.println("list = " + list2);
        System.out.println("max = " + max);
        int lengthOfArrayList = list2.size();
        System.out.println("lengthOfArrayList = " + lengthOfArrayList);

        Collections.sort(list2);
        System.out.println("list2 = " + list2);

        System.out.println("reverse list2 = " + list2);

        int i=0,j=4;
        for (int k = 0; k < list2.size()/2; k++) {
            Collections.swap(list2,i++,j++);
        }

        System.out.println("list2 = " + list2);

        System.out.println("---------------------");
        ArrayList <Integer> list3=new ArrayList<>();

        list3.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5,0,6,0,7,0,8));
            swapElementsInArrayList(list3);

    }
    public static ArrayList <Integer> swapElementsInArrayList(ArrayList arrayList){

        int size=arrayList.size();


        arrayList.removeAll(singleton(0));
        System.out.println("arrayList = " + arrayList);

        int newSize=size-arrayList.size();

        for (int k = 0; k < newSize; k++) {
            arrayList.addAll(Arrays.asList(0));
        }
        System.out.println("list3 = " + arrayList);
        return arrayList;

    }
    public static ArrayList <Integer> swapElementsWithLastInArrayList(ArrayList arrayList){

        swap(arrayList,0,arrayList.size()-1);
        System.out.println("change first with the last one ->>  arrayList = " + arrayList);

        swap(arrayList,0,arrayList.size()-3);
        System.out.println("change first with the index 3 one ->> arrayList = " + arrayList);

        System.out.println("----------------");arrayList.addAll(Arrays.asList(0));

        System.out.println("arrayList = " + arrayList);

         return  arrayList;

    }
}
