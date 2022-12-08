package day34_static_continue_garbageCollection_AccessModofoiers;

import Day30_CustomClass_Intro.Dog;
import Day30_CustomClass_Intro.Student;
import day32_CustomClass_Constructor.Car;
import day33CustomClass_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    private static GarbageCollection garbageCollection;

    public static void main(String[] args) {

       //String str=null;
       String str1="";
      // int x= Integer.parseInt(null);
       // int x=null;
        //System.out.println("str = " + str.toUpperCase());
        System.out.println("str = " + str1.toUpperCase());

        String str2="Wooden Spoon";
        System.out.println(str2);

        str2=null;
        System.out.println(str2);

        Car car1=new Car("Toyota");
        System.out.println(car1);
        car1=null;
        System.out.println(car1);

        Dog dog =new Dog();
        dog.name = "Lucy";

        new Dog();
        dog = new Dog();
        dog.name = "Max";
        System.out.println(dog);

        String language = "Python";

                language=  "Java";
        System.out.println(language);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        ArrayList<Integer> list2=list1;
        list2.addAll(Arrays.asList(20,30,40));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println(list1 == list2);



        Student student=new Student();
        Student student2=new Student();
        student.name= "Jon";
        student.grade='A';
        student = student2;
        System.out.println(student);
        System.out.println(student2);


    }
}
