package TasksGeneral_till_64;

import java.util.Scanner;

public class ternaryOperator_02_3_061 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int nmb1=scanner.nextInt();
        System.out.println("Enter number 2 :");
        int nmb2=scanner.nextInt();
        int bigger=(nmb1>nmb2)?nmb1:nmb2;
        System.out.println(bigger);
        System.out.println("===============");
        System.out.println((nmb1>nmb2)? nmb1:nmb2);

    }
}
