package day_37_OOP_Inheritance_Continue_SuperKeyword;

public class Cats extends Animals{

    public Cats(String name, char gender, String size, int age, String colour) {
        super(name, gender, size, age, colour);

    }
    public void scracth(){
        System.out.println(" is scracthing");
    }
}
