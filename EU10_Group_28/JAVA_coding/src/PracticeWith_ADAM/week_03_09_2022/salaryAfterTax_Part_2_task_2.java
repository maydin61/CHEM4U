package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class salaryAfterTax_Part_2_task_2 {
    public static void main(String[] args) {

        System.out.println("Are married? yas/no");
        Scanner scan1=new Scanner(System.in);
        String marriedOrNot= scan1.nextLine();
        if (marriedOrNot == "yes") {

        }

        System.out.println("Please enter the yearly salary");


        Scanner scan=new Scanner(System.in);
        Integer salaryAfterTax= scan.nextInt();
        if (salaryAfterTax>130000) {
            System.out.println("Net Salary After the tax is :" +
                    (salaryAfterTax - salaryAfterTax * 0.35));
        }


    }
}
  /*the tax rates are:
35% for salary of 130K or more30% for salary of 100K to 130k
(excluded)
25% for salary of 80K to 100K
(excluded)
20% for salary less than 80Kin addition, if the person is married, he/she will pay 5%
less tax

         */