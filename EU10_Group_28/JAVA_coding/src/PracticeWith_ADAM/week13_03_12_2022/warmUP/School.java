package week13_03_12_2022.warmUP;

import java.util.ArrayList;
import java.util.Arrays;

public class School {


    static  ArrayList<Teacher> teachers = new ArrayList<>();  // doing it static you can reach it

    static {
        // ArrayList<Teacher> teachers = new ArrayList<>();

        Teacher teacher1=new Teacher("Aydin", "Muhammet",'M',1980,123L);
        Teacher teacher2=new Teacher("Monica", "Ionescu",'F',1999,183L);
        Teacher teacher3=new Teacher("Andrei", "Alexandru",'M',2001,133L);
        Teacher teacher4=new Teacher("Ioana", "Cretu",'F',1950,124L);
        Teacher teacher5=new Teacher("Adnan", "John",'M',2000,174L);
        Teacher teacher6=new Teacher("David", "Barbu",'M',1997,524L);

        teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5,teacher6));


    }

    public static void main(String[] args) {
        System.out.println(teachers);
        ArrayList<Teacher> result = getTeachersNameStartWithM("M");
        System.out.println("starts with M result = " + result);


        ArrayList<Teacher> result2 = getTeacherByGender ('F');
        System.out.println("gender list result2 = " + result2);

        ArrayList<Teacher> result3 = getAgeLessThen(34);
        System.out.println("age is less then result3 = " + result3);

        ArrayList<Teacher> result4 = getBornIn(1980);
        System.out.println("age is less then result4 = " + result4);


        /*
         6. create a method in School class then find the teachers age smaller than 30

    7. create a method in School class then find the teachers born in 1967 year
         */


    }

    private static ArrayList<Teacher> getBornIn(int dateOfBorn) {
        ArrayList<Teacher> result= new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.dateOfBirth == dateOfBorn)
                result.add(teacher);
        }
        return result;
    }

    private static ArrayList<Teacher> getAgeLessThen(int age) {
        ArrayList<Teacher> result= new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.age >= age)
                result.add(teacher);
        }
        return result;
    }

    private static ArrayList<Teacher> getTeacherByGender(char gender) {
        ArrayList<Teacher> result= new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.gender == gender)
                result.add(teacher);


        }
        return result;

    }


    private static ArrayList<Teacher> getTeachersNameStartWithM(String prefix) {
        ArrayList<Teacher> result= new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.name.startsWith("M")){
                result.add(teacher);

            }
        }
        return result;
    }


}
