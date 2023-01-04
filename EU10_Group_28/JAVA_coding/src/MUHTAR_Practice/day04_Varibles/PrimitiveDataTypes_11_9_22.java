package JAVA_coding.src.MUHTAR_Practice.day04_Varibles;

public class PrimitiveDataTypes_11_9_22 {
    public static void main(String[] args) {

       byte age = 71;
       short year = 2022;
       int salary = 1700;
       int salary2 = 8520;
       long miles = 2100000l;
           double tax = 0.19;
           double tax2 = 0.40;
           double netsalary = tax*salary;
           double netsalary2 = salary2-tax*salary2;
           float pi = 3.1416f;
           float area = pi*5f;
           char ch1 = '@';
           char ch2 = '#';
           boolean result1 = true;
           boolean result2 = false;
           boolean result3 = age>88 ;
       int a = 120;
       int b = 23;
       boolean aIsGreaterThenB = a>b;
       System.out.println("age: "+age);
       System.out.println("miles;"+miles);
       System.out.println("Pi number:"+pi);
       System.out.print(ch2 );
       System.out.print("      ");
       System.out.println(ch1);
       System.out.println("tax calculation:"+tax);
       System.out.println("Calculation yearly holiday:"+age*(year/100));
       System.out.print(result3);
       System.out.println(":age is ");
       System.out.println(aIsGreaterThenB);
       System.out.print("area of cycle with r(5) is ");
       System.out.println(area);
       System.out.print("Net salary is ");
       System.out.println(netsalary);
       System.out.println(netsalary2);
                }
    }

