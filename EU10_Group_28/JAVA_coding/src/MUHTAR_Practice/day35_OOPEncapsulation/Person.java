package JAVA_coding.src.MUHTAR_Practice.day35_OOPEncapsulation;

public class Person {

    public String name,language;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;



    }

    public static void printPlanetName(){
        System.out.println("Name of planet: "+ planet);

    }
    public void eat(String food){
        System.out.println(name+" is eating "+ food);

    }
    public void drinking(String drink){
        System.out.println(name+" is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}
