package JAVA_coding.src.MUHTAR_Practice.day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Practice2 {
    public static void main(String[] args) {

        ArrayList <String > employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed","Hamza","Cemal","Halid", " Cemal", "Hafsa","Erenay","Jimmy","Dani"));


        employees.retainAll(Arrays.asList("Ahmed","Halid","Hafsa"));
        System.out.println("employees = " + employees);

        String [] names = {"Mary", "Monica", "Musti","Ahmed","Hasan","Berny","Cemal","Erenay","Aydin"};
        ArrayList <String > list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p-> p.startsWith("M"));
        System.out.println("list = " + list);

        list.removeIf(p-> p.endsWith("in"));
        System.out.println("list = " + list);

        list.removeIf(p-> p.contains("a"));
        System.out.println("list = " + list);

        list.removeIf(p-> p.contains("a"));
        System.out.println("list = " + list);

        names= list.toArray(new String [0]);
        System.out.println("names = " + Arrays.toString(names));

    }
}
