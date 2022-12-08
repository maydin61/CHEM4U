package day28_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class uniqueElement {
    public static void main(String[] args) {


        ArrayList<String > list=new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        list.add("Python");
        list.add("Ruby");
        list.add("C#");
        list.add("C#");
        list.add("Java");
        list.add("C++");

        ArrayList<String > removeDoublicate= new ArrayList<>();
    for (String element:list) {
        if (!removeDoublicate.contains(element))
            removeDoublicate.add(element);

        }
        System.out.println("removed doublicated elements: "+removeDoublicate);

        ArrayList<String > unique= new ArrayList<>();
        for (String element:list){
            if ( list.indexOf(element) == list.lastIndexOf(element)){
                unique.add(element);
            }
        }
        System.out.println("");
        System.out.println("unique elements :"+unique);
    }

}

