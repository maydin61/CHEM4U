package JAVA_coding.src.SELF_work.TasksGeneral_from_65_;

import java.util.Scanner;

public class alejandro_1_3_074 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        String emailReadOrNot=name.next();


        if (emailReadOrNot.contains("alex")){
            System.out.println("read this email");

        }else {
            System.out.println("do not read this email");
        }
    }
}
