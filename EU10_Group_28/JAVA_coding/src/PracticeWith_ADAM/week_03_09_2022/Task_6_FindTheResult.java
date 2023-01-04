package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class Task_6_FindTheResult {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        Integer nmb= scan.nextInt();
        int a = nmb;
        if(a%3==0) { System.out.println("Can divided by 3 without rest,  "+(a+20));
        }else if (a%5 == 0) { System.out.println("Can divided by 5 without rest "+(a+25));
        }else if (a%15==0)  { System.out.println("Can divided by 15 without rest "+(a+50));
        }else               { System.out.println("Invalid not divisible " +
                            "by any of 3, 5 or 15");





        }
    }
}
