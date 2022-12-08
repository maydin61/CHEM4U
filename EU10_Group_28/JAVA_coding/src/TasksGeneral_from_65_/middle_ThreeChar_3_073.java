package TasksGeneral_from_65_;

import java.util.Scanner;

public class middle_ThreeChar_3_073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int lengthOfWord = word.length();
        if (lengthOfWord > 5 && lengthOfWord % 2 != 0) {
            // midpoint ==> 9/2= 4 is midpoint then if we wanted to print mid three terms
            // midpoint-1, midpoint and midpoint+1
            int midPoint = lengthOfWord / 2;
            String midThreeTerms = word.substring(midPoint - 1, midPoint + 1);
            System.out.println(midThreeTerms);
            String deneme=word.substring(midPoint-1,midPoint+2);
            System.out.println(deneme);
        } else if (lengthOfWord % 2 == 0) {
            System.out.println("Even(2,4,4, ....) number of string ware use, please change it to odd one");

        }else {
            System.out.println("Short characters are given, give longer one");
        }
    }
}