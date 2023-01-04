package JAVA_coding.src.MUHTAR_Practice.day34_static_continue_garbageCollection_AccessModofoiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;     // pi=3.14
    public static String name;   // name = "Circle";

    public static ArrayList<Integer>  numbers;



    public Circle (double radius){
        this.radius = radius;
       // pi = 3.14;
    }

 static {
      //  radius= 4;
        pi=3.14;
        name="Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
/*

    public static void main(String[] args) {
        pi= 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
    */
}
