package JAVA_coding.src.SELF_work.TaskGeneral_from_85;

import java.util.Scanner;

public class zombieAttack_3_087 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int population = scan.nextInt();
        //for (int i = 0; i < population; i++) {
          int day=0;
        System.out.println("Day" + day + "["+ population+"]");

        while (population>0){
        population = population/2 ;

            System.out.println("Day" + (day+1) + "["+ population+"]");

            day++;


          }
        }
    }

