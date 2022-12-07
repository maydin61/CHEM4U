package dayDay36_OOP_Inheritance_Intro;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student("Andrei","ODTU",12,'M','B');
        Student student2=new Student("Ana","MIT",1,'F','A');
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        student2.setAge(13);
        System.out.println("student2 = " + student2);


    }
}
