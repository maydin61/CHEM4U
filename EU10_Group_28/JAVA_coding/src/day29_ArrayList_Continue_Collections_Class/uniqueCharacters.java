package day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueCharacters {
    public static void main(String[] args) {

        String str = "accsdaesdddasdfdg13";
       uniqueElementsInString(str);

    }
    public static ArrayList<String> uniqueElementsInString(String str){
        ArrayList < String  > list= new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list = " + list);
        list.removeIf(each ->  Collections.frequency(list,each) >1 );
        System.out.println("list = " + list);

        return list;
    }


}
