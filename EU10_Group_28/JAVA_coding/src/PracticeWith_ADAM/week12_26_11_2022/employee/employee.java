package JAVA_coding.src.PracticeWith_ADAM.week12_26_11_2022.employee;

public class employee {


    public String  name;
    public int  ID;
    public char gender;

    public void setINFO(String name, int ID, char gender) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }

    public void setINFO(String name) {
        this.name = name;
    }

    public void setInfo(int ID) {
        this.ID = ID;
    }

    public void setINFO(char gender) {
        this.gender = gender;
    }

    public void setINFO(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                '}';
    }

}
