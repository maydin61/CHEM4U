package day28_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList < Integer > newNumbers = new ArrayList < Integer>() ;
        ArrayList < String > names= new ArrayList<>();

        newNumbers.add(10);
        newNumbers.add(10);
        newNumbers.add(10);
        newNumbers.add(10);
        newNumbers.add(20);
        newNumbers.add(30);
        newNumbers.add(40);
        newNumbers.add(50);
        newNumbers.add(55);
        newNumbers.add(54);
        newNumbers.add(50);
        System.out.println(newNumbers);

        Integer nmb=40;
        newNumbers.remove(nmb);
        System.out.println(newNumbers);

        newNumbers.remove(newNumbers.indexOf(50));
        newNumbers.remove(newNumbers.lastIndexOf(50));
        System.out.println(newNumbers);

        newNumbers.removeAll(Collections.singleton("10"));
        System.out.println(newNumbers);

        int nm=10;
        newNumbers.removeAll(Collections.singleton(nm));
        System.out.println(newNumbers);



        newNumbers.clear();
        System.out.println(newNumbers);

        ArrayList < Character > characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        System.out.println(characters);
        System.out.println(characters.indexOf('A'));
        System.out.println(characters.lastIndexOf('A'));

        ArrayList < Character > characters2=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        System.out.println(characters == characters2);
        System.out.println(characters.equals(characters2));

        ArrayList < Integer > number1 =new ArrayList<>();

        ArrayList < Integer > number2 =new ArrayList<>();

        number1.add(10);
        number1.add(10);
        number1.add(10);

        number2.add(10);
        number2.add(10);
        number2.add(10);

        System.out.println(number1 == number2);

        System.out.println(number1.equals(number2));

        System.out.println(number1.size());
        System.out.println(number2.size());

        System.out.println( number2.isEmpty());

        System.out.println(! number2.isEmpty());
        System.out.println("========");

        ArrayList<Integer> num= new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3,4,1,6) );
        System.out.println(num);
        num.addAll(Arrays.asList(10,50,1,40,50));
        System.out.println(num);
        num.removeAll(Arrays.asList(1));
        System.out.println(num);
        // num.retainAll(Arrays.asList(50,6));

    }
}
