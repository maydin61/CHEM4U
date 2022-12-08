package Day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

public class swap_firstAndLAnd_ElementsInArrayList {
    public static void main(String[] args) {

        ArrayList <Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(2,4,6,8,9,20));
        System.out.println("list = " + list);

        swap(list,0,list.size()-1);
        System.out.println("change first with the last one ->>  list = " + list);

        swap(list,0,list.size()-3);
        System.out.println("change first with the index 3 one ->> list = " + list);

        System.out.println("----------------");


        ArrayList <Integer> list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int max = max(list2);
        System.out.println("list = " + list2);
        System.out.println("max = " + max);
        int lengthOfArrayList = list2.size();
        System.out.println("lengthOfArrayList = " + lengthOfArrayList);

        Collections.sort(list2);
        System.out.println("list2 = " + list2);
        //list2.removeIf( p-> p==0);
        // System.out.println("list2 = " + list2);
       //  Collections.reverse(list2);

        System.out.println("reverse list2 = " + list2);

        int i=0,j=4;
        for (int k = 0; k < list2.size()/2; k++) {
            Collections.swap(list2,i++,j++);
        }

        System.out.println("list2 = " + list2);

        System.out.println("---------------------");
        ArrayList <Integer> list3=new ArrayList<>();

        list3.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5,0,6,0,7,0,8));
        int size=list3.size();


        list3.removeAll(singleton(0));
        System.out.println("list3 = " + list3);

        int newSize=size-list3.size();

        for (int k = 0; k < newSize; k++) {
            list3.addAll(Arrays.asList(0));
        }
        System.out.println("list3 = " + list3);

    }
}
