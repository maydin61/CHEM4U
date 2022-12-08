package day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList <Integer>  scores =new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,80,79,67,78,64,67,89,89,78,67,55,45,78));

        ArrayList <Integer> gradeOfA =new ArrayList<>(scores);   // 90-100
        gradeOfA.removeIf(p-> p<90);

        ArrayList <Integer> gradeOfB =new ArrayList<>(scores);   // 80 -89
        gradeOfB.removeIf(p-> !(p>=80 && p<90));

        ArrayList <Integer> gradeOfC =new ArrayList<>(scores);   // 70-79
        gradeOfC.removeIf(p-> !(p>=70 && p<80));


        ArrayList <Integer> gradeOfD =new ArrayList<>(scores);   // 76-69
        gradeOfD.removeIf(p-> !(p>=60 && p<70));


        ArrayList <Integer> gradeOfF =new ArrayList<>(scores);   // 0-59
        gradeOfF.removeIf(p-> p>=59);

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);

        ArrayList <Integer> gradeOfFF =new ArrayList<>(scores);   // 90-100

      gradeOfFF.removeAll(gradeOfA);
      gradeOfFF.removeAll(gradeOfB);
      gradeOfFF.removeAll(gradeOfC);
      gradeOfFF.removeAll(gradeOfD);
        System.out.println("gradeOfFF = " + gradeOfFF);
        System.out.println("Total number of A :"+ gradeOfA.size());
        System.out.println("Total number of B :"+ gradeOfB.size());
        System.out.println("Total number of C :"+ gradeOfC.size());
        System.out.println("Total number of D :"+ gradeOfD.size());
        System.out.println("Total number of  :"+ gradeOfF.size());

    }
}
