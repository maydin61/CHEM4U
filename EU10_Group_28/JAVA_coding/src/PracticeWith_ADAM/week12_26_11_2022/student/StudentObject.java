package JAVA_coding.src.PracticeWith_ADAM.week12_26_11_2022.student;

public class StudentObject {
    public static void main(String[] args) {


     Student student1=new Student("Ahmed");


     Student student2= new Student("Hamza",23,45);

     student1.age=34;
     student1.batchNumber=67;


        System.out.println(student1);
        System.out.println(student2);

    }
}