package week_05_4_08_10_2022;

import java.util.Scanner;

public class printOutLastTwoWords {
    public static void main(String[] args) {
        System.out.println("Enter a word with min two letters");
        Scanner scanner=new Scanner(System.in);

        String word=scanner.nextLine();
        int indexOfLastChar=word.length()-1;
        int indexOfBeforeLastChar=word.length()-2;

        char last=word.charAt(indexOfLastChar);
        char beforeTheLast=word.charAt(indexOfBeforeLastChar);
        String lastTwo=""+last+beforeTheLast;
        System.out.println(lastTwo+lastTwo+lastTwo);



        int result1=word.length()-1;
        int result2=word.length()-2;


    }
}
