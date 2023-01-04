package JAVA_coding.src.PracticeWith_ADAM.week12_26_11_2022.student;

public class Student {


    public String name;

    public int age;

    public long batchNumber;



    public static String school= "Cydeo";

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);                            // this.name = name;
        this.age = age;
    }

    public Student(String name, int age, long batchNumber) {
        this(name,age);         //this.name = name;
                                //this.age = age;
        this.batchNumber = batchNumber;
    }
        //  not use over Write, change in class name future will give you comp error
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
