package JAVA_coding.src.MUHTAR_Practice.day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String [] countries = {"TR", "RO", "USA", "BG","MD","UK","Gr","United Kingdom", "Bosnia I Herzegovina"};
        System.out.println("countries : "+Arrays.toString(countries));
        ArrayList <String > countryNames= new ArrayList<>(Arrays.asList(countries)) ;

        countryNames.removeIf(p-> p.startsWith("T"));

        System.out.println("countryNames = " + countryNames);

        countryNames.removeIf(p-> p.endsWith("K"));
        System.out.println("countryNames = " + countryNames);

        countryNames.removeIf(p-> p.contains("S"));
        System.out.println("countryNames = " + countryNames);

        countryNames.removeIf(p-> p.equalsIgnoreCase("gr"));
        System.out.println("countryNames = " + countryNames);

        countryNames.removeIf(p-> p.length()>15);
        System.out.println("countryNames = " + countryNames);

        countryNames.removeIf(p-> p.contains(" "));
        System.out.println("countryNames = " + countryNames);

        // Array list to Array
        countries = countryNames.toArray(new String [0]);   // new String [0] number will change automatically
        // using loop method also you can add them to array list too

        System.out.println("countries = " + Arrays.toString(countries));


    }
}
