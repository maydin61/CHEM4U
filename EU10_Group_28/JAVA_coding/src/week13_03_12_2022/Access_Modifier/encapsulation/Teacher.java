package week13_03_12_2022.Access_Modifier.encapsulation;

public class Teacher {
    private String name;
    private int ID;

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Teacher(String name, int ID) {
        if (name.equals("XXXX"))
            System.out.println("you can not use");

        else
            this.name = name;
        if (ID < 0 )
            System.out.println("you can not use it also");
        else
            this.ID = ID;

        this.name = name;
        this.ID = ID;


    }


    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
