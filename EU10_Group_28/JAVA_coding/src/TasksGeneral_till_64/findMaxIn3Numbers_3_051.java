package TasksGeneral_till_64;

import java.util.Scanner;

public class findMaxIn3Numbers_3_051 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n1 = number.nextInt();
        int n2 = number.nextInt();
        int n3 = number.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " the biggest number"+n1+","+n2+","+n3);

        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " the biggest number"+n1+","+n2+","+n3);

        } else if (n3>n1 && n3>n2) {
            System.out.println(n3+ " the biggest number"+n1+","+n2+","+n3);

        } else {
            System.out.println(""+n1+""+n2+""+n3);
        }
    }
}
