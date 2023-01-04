package JAVA_coding.src.MUHTAR_Practice.day_20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practice {
    // 1. create an array named classmates, and store 10 of your classmates' full names
    //            print the initials of each classmates in separate lines
    public static void main(String[] args) {

      //  System.out.println("enter name");

       // String[] names  = new String[10];
        String[] nameS  = { "Ahmet Solak", "Buse Akin", "Cemal Aydin","David Sandu",
                "Alex Olaru", "Sorin J","Sorina JJ","Alexandra Dj","Yildirim Savas",
                "Cozma Key"};
     //   System.out.println((nameS[1]));

        for (int i = 0; i < nameS.length; i++) {
            System.out.println(nameS[i].charAt(0)+"."+nameS[i].charAt(nameS[i].indexOf(" ")+1 )+".");

        }

    }
}
