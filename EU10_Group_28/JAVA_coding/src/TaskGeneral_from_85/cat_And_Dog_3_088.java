package TaskGeneral_from_85;

import java.util.Scanner;

public class cat_And_Dog_3_088 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int countJava = 0 , countPython = 0 ;

        String word= scan.nextLine();   // nextLine must be for full sentence enter by user a word or sentence
        // catcatin dog id dogggg
        // 0123456789------------
        int wordCounter=word.length();
        int targetCharChrctr = 4;           // character count of target word we are looking for

        for (int i = 0; i < wordCounter-targetCharChrctr; i++) {     // looking for target word
            String currentWord = word.substring(i,i+targetCharChrctr);
           // System.out.println(currentWord);

            if ( currentWord.equalsIgnoreCase("java")){
                countJava++;
               // System.out.println("Cat Found :");

            } else if (currentWord.equalsIgnoreCase("python")) {
                countPython++;
               //System.out.println("Dog Found :");
            }

            // if ( word.substring(i,i+targetCharChrctr).equals("cat"))

           // System.out.println(word.substring(i,i+targetCharChrctr));    // three character word
        }
        System.out.println(countJava > 0 );
    }
}
