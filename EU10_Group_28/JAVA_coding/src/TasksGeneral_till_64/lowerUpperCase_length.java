package TasksGeneral_till_64;

import java.util.Scanner;

public class lowerUpperCase_length {
    public static void main(String[] args) {
        String sentence = "Today is a GrEat Day to learn Java with CHEM4u";
        sentence = sentence.toLowerCase();
        System.out.println("sentence = " + sentence);

        sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);

        String nameSurname= "Aydin Muhamet";
        System.out.println("length "+ nameSurname.length());

        String course= "Cydeo SDET";
        int lenghttotal= course.length();
        System.out.println("lenghttotal = " + lenghttotal);




        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter two words from keyboard");
        String firstWord = scanner.next();
        String secondWord = scanner.next();

        String new1 = firstWord.substring(1);
        String new2 = secondWord.substring(1);

        System.out.println(new1 + new2);

        scanner.close();
    }
}
