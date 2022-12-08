package Day30_CustomClass_Intro;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1= new Employee();
        Employee employee2= new Employee();
        Employee employee3= new Employee();
        Employee employee4= new Employee();
        Employee employee5= new Employee();

        employee1.setInfo("Halid",123,23,'M',"Office Boy",45000,true);
        employee2.setInfo("Hafsa",234,22,'F',"Secretary",55000,true);
        employee3.setInfo("Hamza",453,24,'M',"DevOp",65000,true);
        employee4.setInfo("Ahmed",567,34,'M',"QA",35000,false);
        employee5.setInfo("Erenay",345,45,'F',"Manegar",95000,true);

        Employee [] employees = {employee1,employee2,employee3,employee4,employee5};

        int fullTimes=0;
        int partTime=0;

        double maxSalary=employees[0].salary;   // assume as max salary
        double minSalary=employees[0].salary;   // assume as min salary

        for (Employee employee : employees) {
            if (employee.isFullTime){
                fullTimes++;
            }
            if (! employee.isFullTime){
                partTime++;
            }
            if (employee.salary > maxSalary){
                maxSalary = employee.salary;
            }
            if (employee.salary < minSalary){
                minSalary = employee.salary;
            }
        }
        System.out.println("fullTimes = " + fullTimes);
        System.out.println("partTime = " + partTime);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);

    }
}
