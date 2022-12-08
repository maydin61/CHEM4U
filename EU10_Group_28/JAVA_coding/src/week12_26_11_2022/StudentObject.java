package week12_26_11_2022;

public class StudentObject {
    public class Student {


        public String name;

        public int age;

        public long batchNumber;



        //public static String school= "Cydeo";

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
    public static void main(String[] args) {


        week12_26_11_2022.student.Student student1=new week12_26_11_2022.student.Student("Ahmed");


        week12_26_11_2022.student.Student student2= new week12_26_11_2022.student.Student("Hamza",23,45);

        student1.age=34;
        student1.batchNumber=67;


        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}