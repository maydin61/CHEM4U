package week_06_15_10_2022;

import java.util.Scanner;

public class countingSpecificWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // String sentence = "cat-cheetah-dog-cat";
        //0123 45 6789- ---- -- ----------

        String dog = "dog", cat = "cat";
        int counterDog = 0, counterCat = 0;

        for (int i = 0; i < str.length() - dog.length(); i++) {
            String each = str.substring(i, i + dog.length()); // part by part looking for word "dog" in given string value
            if (each.equalsIgnoreCase(dog))       // if we have only one if close we do not need to use curlicues
                counterDog++;
        }
       // System.out.println(counterDog);

        for (int i = 0; i < str.length() - cat.length(); i++) {
            String each = str.substring(i, i + cat.length());
            if (each.equalsIgnoreCase(cat))       // if we have only one if close we do not need to use curlicues
                counterCat++;
        }
      //  System.out.println(counterCat);


        if (counterDog != counterCat) {
            System.out.println("false");
        } else {
            System.out.println("true");


        }
    }
}
