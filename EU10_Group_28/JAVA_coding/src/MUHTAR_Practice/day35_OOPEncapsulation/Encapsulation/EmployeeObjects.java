package JAVA_coding.src.MUHTAR_Practice.day35_OOPEncapsulation.Encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee=new Employee("Ioana",'F',23,23000);
        System.out.println("employee = " + employee);
        Employee employee1 =new Employee("Vlad",'M',45,56000);
        System.out.println("employee1 = " + employee1);
        Employee employee2 =new Employee("",'F',45,78000);
        System.out.println("employee2 = " + employee2);

        employee2.setSalary(45600);
        System.out.println("employee2 = " + employee2);

    }
}
