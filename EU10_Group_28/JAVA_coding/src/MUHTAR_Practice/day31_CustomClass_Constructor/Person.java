package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor;

public class Person {

    public String name;    // custom class
    public char gender;
    public int age;


    public Person (String name, char gender, int age){           //defaults constructor
      this.name=name;
      this.gender=gender;
      this.age=age;




    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
