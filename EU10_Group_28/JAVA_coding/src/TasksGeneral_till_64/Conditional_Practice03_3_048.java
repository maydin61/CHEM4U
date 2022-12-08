package TasksGeneral_till_64;

import java.util.Scanner;

public class Conditional_Practice03_3_048 {
    public static void main(String[] args) {
        String Chem,Faa;
        Scanner inputName = new Scanner(System.in);
        String name = inputName.next();
        if (name.equals("Chen")) {
            System.out.println("teacher");
        } else if (name.equals("Faa")) {
            System.out.println("student");

        } else {
            System.out.println("invalid name");
        }
    }
}