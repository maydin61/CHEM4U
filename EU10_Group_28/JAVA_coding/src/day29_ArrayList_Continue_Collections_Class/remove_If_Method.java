package day29_ArrayList_Continue_Collections_Class;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class remove_If_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("list = " + list);
        list.removeIf( p-> p<5   );

        System.out.println("list = " + list);

        list.removeIf( p-> p%2==0   ); // lambda expression , remove the all p%2 == 0 in list
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list2.removeIf( each -> each %3 != 0);
        System.out.println("list2 = " + list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java","C++","Javascript","Ruby","C","Python","GW Basic","C+"));
        System.out.println("list3 = " + list3);

        list3.removeIf(each-> each.startsWith("J"));
        System.out.println("list3 = " + list3);

        list3.removeIf(each-> each.startsWith("P"));
        System.out.println("list3 = " + list3);

        list3.removeIf(each -> each.endsWith("+"));
        System.out.println("list3 = " + list3);


    }
}
