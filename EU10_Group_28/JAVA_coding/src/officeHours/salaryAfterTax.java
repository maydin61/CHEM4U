package officeHours;

import java.util.Scanner;

public class salaryAfterTax {
    public static void main(String[] args) {
        double tax=0.15;
        Scanner scan=new Scanner(System.in);
        System.out.println("Name of person: ");
        String name=scan.nextLine();
        System.out.println("Salary");
        int salary0= scan.nextInt();
        double salary=salary0-(salary0*tax);
        System.out.println("Salary of " + name+" : "+salary);


        int NumberOfWorker=50; // Camel Case, first characteris lower and each new one start with upper one
        double Maydin_6134_55=34.61;
        String thisISJavaRuleThatWeHaveToObey;
        String word="a word";
        String sentence = "Live in Constanta is very nice.";
        String number = "1453";
        int number0 = 1453;
        System.out.println(number);
        System.out.println(number0);
        int cal;
        System.out.println(word+sentence);


    }
}
