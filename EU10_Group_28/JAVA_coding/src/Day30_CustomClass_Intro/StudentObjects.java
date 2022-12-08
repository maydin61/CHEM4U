package Day30_CustomClass_Intro;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1= new Student();
        Student student2= new Student();
        Student student3= new Student();
        Student student4= new Student();
        Student student5= new Student();
        student1.setINFO("Ali",'M',14,230,'B');
        System.out.println(student1);

        student2.setINFO("Veli",'M',15,90,'A');
        System.out.println(student2);

        student3.setINFO("Hafsa",'F',15,920,'A');
        System.out.println(student3);

        student4.setINFO("Halid",'M',14,20,'B');
        System.out.println(student4);

        
        Student [] studentsList = {student1,student2,student3,student4,student5};

        for (Student student : studentsList) {
            System.out.println(student);
        }
        System.out.println("------------------");

        ArrayList <Student> earlyBirds = new ArrayList<>();  // grade A
        ArrayList <Student> angryBirds = new ArrayList<>();  // 

        int numberOfEarlyBirds = 0;
        int numberOfAngryBirds = 0;
        for (Student student : studentsList) {
            if (student.grade == 'A') {
                earlyBirds.add(student);
                numberOfEarlyBirds++;
            }else{
                angryBirds.add(student);
                numberOfAngryBirds++;
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("numberOfEarlyBirds = " + numberOfEarlyBirds);
        System.out.println("numberOfAngryBirds = " + numberOfAngryBirds);

    }
}
