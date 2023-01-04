package JAVA_coding.src.MUHTAR_Practice.day33CustomClass_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Students student1=new Students("Halid");
        Students student2=new Students("Cemal", 'M');
        Students student3=new Students("Cemal", 'M',34);
        Students student4=new Students("Hafsa",'F',16,234,'A');
        System.out.println("student4 = " + student4);
        Students [] students = {student1,student2,student3,student4};
        System.out.println("students = " + Arrays.toString(students));
        System.out.println(student4 == student1);
        Students students5= new Students("Veli",'M');

    }
}
