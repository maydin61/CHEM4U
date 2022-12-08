package day35_OOPEncapsulation.Encapsulation;

public class Employee {


    private String name;

    private char gender;

    private int age;

    private double salary;

    // starts here

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("in-correct name"+name);
            return;
            //System.exit(0);
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender =='F' || gender == 'm' || gender == 'f')){
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <17 || age >150){
            System.out.println("in-correct age"+age);
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0){
            return;
        }
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, double salary) {

        setName(name);         //this.name = name; give us checking the info if condition were given
        setGender(gender);     //this.gender = gender;
        setAge(age);            //this.age = age;
        setSalary(salary);      //this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
