package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethoh {
    public static void main(String[] args) {
        ArrayList < Integer> numbers= new ArrayList<>();

        ArrayList < String> students= new ArrayList < > ();

        students.add("Aydin");
        students.add("Cemal");
        students.add("Hafsa");
        students.add("Hamza");
        students.add("Almula");
        students.add("Muhammet");
        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.getClass());
        System.out.println(students.get(2));
        System.out.println(students.set(5,"Ali"));
        System.out.println(students.set(0,"Family"));
        System.out.println(students.contains("Almula"));



        ArrayList < Integer> number= new ArrayList<>();
        number.add(2);
        number.add(20);
        number.add(24);
        number.add(26);
        number.add(28);
        System.out.println(number);
        number.add(2,40);
        number.add(4,99);
        System.out.println(number);
        System.out.println(number.size());
        System.out.println("the last index number: "+(number.size()-1));

        int num= number.get(1);

        number.add(num);
        System.out.println(number);
        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i)+" - ");
        }
        System.out.println("");
        number.set(0,89);
        System.out.println(number);

        ArrayList< String > listOf= new ArrayList<>();

        listOf.add("Java");
        listOf.add("C++");
        listOf.add("C#");
        listOf.add("Python");

        System.out.println(listOf);

        listOf.set(3,"Java Script");
        System.out.println(listOf);

    }
}
