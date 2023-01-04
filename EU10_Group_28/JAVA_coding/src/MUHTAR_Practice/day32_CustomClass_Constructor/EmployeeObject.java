package JAVA_coding.src.MUHTAR_Practice.day32_CustomClass_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Muhammet Aydin");

        Employee employee2=new Employee("Ahmet Hamza",'M');

        Employee employee3=new Employee("Cemal Halid",'M',"QA");

        Employee employee4=new Employee("Erenay",'F',"SDET",98000);



        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);
        System.out.println("employee4 = " + employee4);
    }
}
