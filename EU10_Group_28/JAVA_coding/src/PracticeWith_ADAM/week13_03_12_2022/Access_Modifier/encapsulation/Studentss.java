package week13_03_12_2022.Access_Modifier.encapsulation;

public class Studentss {

    private String name;
    private int age;

    public Studentss() {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if ( name.equals("XXXX"))
            System.out.println("you can not");
        else
        this.name = name;
    }

    public void setAge(int age) {
        if (age<=0)
            System.out.println("not correct age");
        else
        this.age = age;
    }


    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
Encapsulation is data hiding How can you implement it?
private access modifier with variables and public getter and setter
 */