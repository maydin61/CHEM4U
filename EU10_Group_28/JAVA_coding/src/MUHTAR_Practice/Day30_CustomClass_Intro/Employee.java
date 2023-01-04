package JAVA_coding.src.MUHTAR_Practice.Day30_CustomClass_Intro;

public class Employee {

    public String name;
    public int ID;
    public  int age;
    public char gender;
    public String jobTitle;
    public int salary;
    public boolean isFullTime;

    public Employee() {

    }

    public void work(){
        System.out.println(jobTitle+ " "+ name+ " is working");
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, int ID, int age, char gender, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }
}
