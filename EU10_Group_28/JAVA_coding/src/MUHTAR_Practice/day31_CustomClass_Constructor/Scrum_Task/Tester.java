package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor.Scrum_Task;

public class Tester {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Teaster{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }
    public void dailyStandUp(){
        System.out.println(name+" is daily stand up");
    }

}
