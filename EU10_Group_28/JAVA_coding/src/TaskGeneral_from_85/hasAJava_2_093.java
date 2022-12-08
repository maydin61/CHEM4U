package TaskGeneral_from_85;

import java.util.Arrays;
import java.util.Scanner;

public class hasAJava_2_093 {
    public static void main(String[] args) {
        boolean exists=false;
        //Scanner scan=new Scanner(System.in);

      //  String word=scan.nextLine();
        String word2="xxxjavajava";
        int lengthOfWord=word2.length();
        String result="java";
        String [] counter = new String[word2.length()];
        // System.out.println((word2.startsWith("java") || word2.indexOf("Java") == 1));
        //  System.out.println((word2.startsWith("java") || word2.substring(1).startsWith("java")));
       //  System.out.println((word2.startsWith("java") || word2.substring(2).startsWith("java")));
       //   System.out.println((word2.startsWith("java") || word2.substring(3).startsWith("java")));
     //   System.out.println((word2.startsWith("java") || word2.substring(4).startsWith("java")));
     //   System.out.println((word2.startsWith("java") || word2.substring(7).startsWith("java")));
        for (int i = 0; i < word2.length(); i++) {
            System.out.println((word2.startsWith("java") || word2.substring(i).startsWith("java")));


        }
        System.out.println(Arrays.toString(counter));
    }
 }


