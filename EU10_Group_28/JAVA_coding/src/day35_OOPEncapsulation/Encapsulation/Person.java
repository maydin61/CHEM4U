package day35_OOPEncapsulation.Encapsulation;

import javax.sound.midi.Soundbank;

public class Person {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge() {
       return age;
    }

    public int setAge(int age) {
        if (age <=0 || age >= 150){
            System.out.println("invalid age"+ age);
            System.exit(0);
        }
        this.age = age;
        return age;
    }
}
