package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor;

public class StudentObject {
    public static void main(String[] args) {

        Student student1= new Student("Halid",13,'M','B',12345);
        Student student2= new Student("Cemal",23,'M','A',67345);

        System.out.println(student1);
        System.out.println(student2);
        student1.ID=23456;
        System.out.println(student1);
        student2.name = "Almula";
        System.out.println(student2);
    }
}
