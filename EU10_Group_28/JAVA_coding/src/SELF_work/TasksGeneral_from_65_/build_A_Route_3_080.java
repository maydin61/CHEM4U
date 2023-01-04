package JAVA_coding.src.SELF_work.TasksGeneral_from_65_;

import java.util.Scanner;

public class build_A_Route_3_080 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Starting point letter A, B, C or D");
        String start= scan.next();
        System.out.println("Ending point letter A, B, C or D");
        String end= scan.next();
        //
        //
        // if A ==> A,B ,C, D
        // if B ==>A,B ,C, D
        // if C ==> A,B ,C, D
        // if D ==>A,B ,C, D

        switch (start) {
            case "A":
                if (end.equals("A")) {
                    System.out.println("A found");

                } else if (end.equals("B")) {
                    System.out.println("right : B found");

                } else if (end.equals("C")) {
                    System.out.println("right > down C found");
                } else if (end.equals("D")) {
                    System.out.println("right > down > left : D found");
                }
                break;

                case "B":
                    if (end.equals("A")) {
                        System.out.println("down > left > up : A found");

                    } else if (end.equals("B")) {
                        System.out.println("B found");

                    } else if (end.equals("C")) {
                        System.out.println("down : C found");
                    } else if (end.equals("D")) {
                        System.out.println("down > left : D found");
                    }
                break;

                case "C":
                    if (end.equals("A")) {
                        System.out.println("left > up : A found");

                    } else if (end.equals("B")) {
                        System.out.println("left > up > right : B found");

                    } else if (end.equals("C")) {
                        System.out.println("C found");
                    } else if (end.equals("D")) {
                        System.out.println("left : D found");
                    }
                break;

                case "D":
                    if (end.equals("A")) {
                        System.out.println("up : A found");

                    } else if (end.equals("B")) {
                        System.out.println("up > right : B found");

                    } else if (end.equals("C")) {
                        System.out.println("up > right > downC found");
                    } else if (end.equals("D")) {
                        System.out.println("left : D found");
                    }
                break;
        }

    }
}
