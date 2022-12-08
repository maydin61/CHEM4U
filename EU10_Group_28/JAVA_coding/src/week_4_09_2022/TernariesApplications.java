package week_4_09_2022;

import java.util.Scanner;

public class TernariesApplications {

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan=new Scanner(System.in);
        Integer n= scan.nextInt();
       /*
        if (n>0){
            System.out.println("positive");
        } else if (n<0) {
            System.out.println("negative");
        }else System.out.println("zero");
   */
        String result=(n>0)? "positive": // Use instead of "else if" block  " ?  "
                      (n<0)?"negative":
                                "zero"; // used instead of "else "    "? "
        System.out.println(result);
    }

}
