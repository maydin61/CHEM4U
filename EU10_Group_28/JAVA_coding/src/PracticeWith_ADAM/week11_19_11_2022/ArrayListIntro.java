package JAVA_coding.src.PracticeWith_ADAM.week11_19_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListIntro {
    public static void main(String[] args) {
        // how to creat a array list
        ArrayList < String> cities = new ArrayList  < String >   ();


        ArrayList < String> cities2 = new ArrayList  < >   ();
        // how to add an element to array list

        cities2.add("London");  // return boolean
        cities2.add("Istanbul");  // return boolean
        cities2.add("Constanta");  // return boolean
        cities2.add("NewYork");  // return boolean
        System.out.println(cities2);

        cities2.add(0,"Roma");  // index of element goes to array list and added element
        System.out.println(cities2);
        cities2.add(3,"Iasi");
        System.out.println(cities2);


        // how get an element
        System.out.println("index 3: "+ cities2.get(3));
        System.out.println("index 1 : "+cities2.get(1));

        cities2.set(3,"Trabzon");
        System.out.println(cities2);          // Iasi change with new city Trabzon

        // how to index of element in array
        System.out.println(cities2.indexOf("Trabzon"));
        System.out.println(cities2.indexOf("London"));

        System.out.println(cities2.indexOf("Iasi")); // np=ot in the list index number is -1

        System.out.println(cities2.contains("Istanbul"));
        System.out.println(cities2.contains("istanbul"));

        System.out.println(cities2.lastIndexOf("NewYork"));
        System.out.println(cities2.lastIndexOf("Rome"));
        // if we have two the same value it will

        System.out.println(cities2.lastIndexOf("NewYork"));
        cities2.add("NewYork");


        cities2.set(0,"Ankara");
        System.out.println(cities2);
        System.out.println(cities2.lastIndexOf("NewYork"));
        System.out.println("==========");

        ArrayList < Integer > numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        numbers.add(15);
        numbers.add(9);
        numbers.add(9);
        numbers.add(91);
        numbers.add(9);
        numbers.add(90);
        numbers.add(92);
        System.out.println(numbers.indexOf(9));
        System.out.println(numbers.lastIndexOf(9));
        System.out.println(numbers);

        // how to remove an element in array list
        numbers.remove(3);   // index number to remove
        System.out.println(numbers);


        numbers.removeAll(Collections.singleton(9));  // character to remove all
        System.out.println(numbers);
        Integer x=1;
        numbers.remove(0);
        System.out.println(numbers);

        // balk operation
        // addAll
        ArrayList < String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Ali", "Veli", "Osman"));

     ArrayList < Integer> numberS=new ArrayList < > (Arrays.asList(2,4,6,8,0,9,89));

        System.out.println(names);
        System.out.println("==========");
        // removeAll

        // retainAll

        // removeIf
        System.out.println(numbers);




                  // each
        numbers.removeIf(k -> k<3);
        System.out.println(numbers);

    }
}
