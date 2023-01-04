package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Ahmed", 'M',23);
        Person person2 = new Person("Hamza", 'M',20);
        Person person3 = new Person("Erenay", 'F',16);
        Person person4 = new Person("Cemal", 'M',14);

        person4.age=24;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


    }
}
