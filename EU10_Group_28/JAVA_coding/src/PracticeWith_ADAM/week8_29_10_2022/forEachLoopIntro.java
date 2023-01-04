package JAVA_coding.src.PracticeWith_ADAM.week8_29_10_2022;

import java.util.Arrays;

public class forEachLoopIntro {
    public static void main(String[] args) {

        int [] numbers={1,2,3,5,4,'a','N'};

        for ( int eachNumber:numbers){
            System.out.print(eachNumber+" " +"\n");


        }
        // toCharArray()
        String str="Aydin Muhammet";
        char [] letters=str.toCharArray();
        System.out.println(Arrays.toString(letters));


        // split method (regex)
        String str1="Java is a good language.";
        String [] words= str1.split(" ");
        for ( String word:words){
            System.out.println(word.replace(".",""));
        }

        String str3= "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] words2=str3.split(", ");
        for (String word:words2){
            System.out.println(word.replace(", ",""));
            System.out.println(word.replace(" ",""));
            System.out.println(word);
        }


    }
}
