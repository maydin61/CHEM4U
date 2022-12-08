package Day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class reverseOrder {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(asList(2,4,6,3,7,9,12));
        Collections.sort(list);
        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("list = " + list);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.addAll(asList(2,4,6,3,7,9,12));

        System.out.println("list = " + list2);


    }
}
