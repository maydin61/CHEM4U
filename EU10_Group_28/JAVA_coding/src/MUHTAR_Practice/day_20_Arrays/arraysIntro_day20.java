package JAVA_coding.src.MUHTAR_Practice.day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraysIntro_day20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] myStudents = new String[14];
        int [] myStudent = new int[11];
        double [] myStudent1 = new double[10];
        boolean [] myStudent2 = new boolean[4];
        System.out.println(myStudents);
                       // without Array.toString will give a [Ljava.lang.String;@13c78c0b...ect
                            //
        System.out.println(Arrays.toString(myStudents));
        System.out.println(Arrays.toString(myStudent));
        System.out.println(Arrays.toString(myStudent1));
        System.out.println(Arrays.toString(myStudent2));
                        // null is the default value in java, if you print the myStudents will give you as
                         // [null, null, null, null, null, null, null, null, null, null, null, null, null, null]
                         // null means no object default values : non-primitive is null
        // For primitive data types byte, short, int, long   ====> 0
        // float, double =====> 0.0
        // boolean   ====> false
    }
}
