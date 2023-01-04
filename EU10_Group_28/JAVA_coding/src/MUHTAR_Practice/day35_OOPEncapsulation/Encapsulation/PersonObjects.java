package JAVA_coding.src.MUHTAR_Practice.day35_OOPEncapsulation.Encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Daniel");
        person2.setAge(20);
        person2.setName("Andrei");
        // person1.setAge(-200);
        System.out.println(person2.getAge()+person2.getName());
        System.out.println(person1.getAge() +" : "+ person1.getName());
    }
}
