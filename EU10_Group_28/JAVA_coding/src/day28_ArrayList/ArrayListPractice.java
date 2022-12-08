package day28_ArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList <Integer>  numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set( i, numbers.get(i)*2 );
        }
        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);

        ArrayList < String> employees= new ArrayList<>();
        employees.add("Aydin");
        employees.add("Halid");
        employees.add("Hafsa");
        employees.add("Hamza");
        employees.add("Muhammet");
        employees.add("Almula Sundus");
        employees.add("Samsun");
        employees.add("Istanbul");
        System.out.println(employees);

        int theLastIndex= employees.lastIndexOf(employees);
        //System.out.println(employees.remove(theLastIndex-1));

        System.out.println("index number of Hamza: "+employees.indexOf("Hamza"));


        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        System.out.println(employees.remove("Istanbul"));
        System.out.println(employees);

        System.out.println(employees.remove("Istanbul"));

    }
}
