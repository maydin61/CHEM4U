package JAVA_coding.src.MUHTAR_Practice.Day30_CustomClass_Intro;

public class Student {

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public String name;            // instant variables
    public char gender;
    public int age;
    public int ID;
    public char grade;


    public void code(){
        System.out.println(name+" is coding");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public void setINFO(String name, char gender, int age, int ID, char grade) {  // change the Student name with void and setINFO
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;



/* public void  setInfo(String name, char gender, int age, int ID, char grade){      // local variable

        this.name = name;               // call instant variable with       this.name
        this.gender = gender;         // call instant variable with       this.name
        this.age = age;             // call instant variable with       this.name
        this.ID = ID;                // call instant variable with       this.name
        this.grade = grade;         // call instant variable with       this.name

*/



    }


}
