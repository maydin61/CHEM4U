package JAVA_coding.src.MUHTAR_Practice.day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class CollectionUtilityClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(asList(1,2,3,4,56,6,9,10,2,-9));
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.reverse(list);
        System.out.println("reverse list = " + list);

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('a','B','k','Z'));

        System.out.println("list2 = " + list2);

        Collections.reverse(list2);
        System.out.println("list2 = " + list2);
        System.out.println("------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,30,40,6,60,2990,1,21,-90));
        System.out.println("list4.before.swap method = " + list4);
        Collections.swap(list4,2,4);
        System.out.println("list4.swap method = " + list4);

        System.out.println("Collections.min(list4) = " + Collections.min(list4));
        System.out.println("Collections.max(list4) = " + Collections.max(list4));

        System.out.println("=======================");

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(10,20,30,10,30,90,11,10,-30));
        System.out.println("number = " + number);
        Collections.replaceAll(number,10,11);
        System.out.println("number = " + number);

        int frequency = Collections.frequency(number,11);
        System.out.println("frequency = " + frequency);
        System.out.println("Collections.frequency(number,11) = " + Collections.frequency(number, 11));


        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList("Java","C++","C++","Java","java","Java","C#"));
        System.out.println("Collections.frequency(strings,\"Java\") = " + Collections.frequency(strings, "Java"));
        System.out.println("Collections.frequency(strings,\"java\") = " + Collections.frequency(strings, "java"));

    }
}
