package week_05_4_08_10_2022;

import java.util.Scanner;

public class replacementFirstOr {
    public static void main(String[] args) {
        System.out.println("Enter a word or sentence");
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();

        System.out.println(text.length());
        System.out.println(text.charAt(1));
        System.out.println(text.charAt(7));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        int lastChar=text.length()-1;
        System.out.println(text.charAt(lastChar));

        System.out.println(text.indexOf('u')); // u letter goes to 2. character
        System.out.println("============");
        int theNumberOfTheLetter=text.indexOf('u');
        int theNumberOfTheLetter1=text.lastIndexOf(4);


        System.out.println("The number of u letters in text:"+theNumberOfTheLetter);
        System.out.println(text.replace("a", "AAydin"));
        System.out.println(text.replaceFirst("aydin", "Ali"));
    }
}
