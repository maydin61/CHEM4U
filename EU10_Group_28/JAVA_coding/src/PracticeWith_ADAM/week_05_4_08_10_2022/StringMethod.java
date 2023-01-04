package JAVA_coding.src.PracticeWith_ADAM.week_05_4_08_10_2022;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        // if we get a specific character ====> charAt(); is used
        String string="Aydin";
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(4));
        //      01234
        //      Aydin matching way

        System.out.println(string.length());  // if we want to get the length of String length()
        System.out.println(string.charAt(string.length()-1));

        System.out.println(string.toLowerCase());  // inorder to .toLowerCase() or .toUpperCase()
        System.out.println(string.toUpperCase());

        String string1 = "    MAydin";    // in order to remove a space before and after your string
        System.out.println(string1.trim());  // we will have space in here
                                            // because string class is immutable

        // if you want to get index of char or string we need to use indexOf() method
        String  number= "012345";
        System.out.println (number.indexOf('3'));
        System.out.println (number.indexOf("3"));
              System.out.println (number.indexOf("34")); // index of 3 is three get the index 34 , it will return to first
        // match one means number 3.

        System.out.println (number.indexOf("14")); // it will return -1 means that there is no 14 in
        // that string, it will return the smallest one if no matching return to -1 value
        String sentence="Java is a programming language";
        System.out.println(sentence.indexOf("programming")); // counting till that word all the charater including space
        System.out.println(sentence.indexOf("programming1")); // if not match goes to -1
        System.out.println(sentence.indexOf("programming "));


                        //012345678901
        String sentence1="Java is Java"; // Java lower or upper case makes diff.
        String sentence12="Java is java"; // Java lower or upper case makes diff.
        System.out.println(sentence1.indexOf("Java")); // return me 0


        System.out.println(sentence1.indexOf("Java")); // return me 0
        System.out.println(sentence1.lastIndexOf("Java"));

        System.out.println(sentence12.indexOf("Java")); // return me 0
        System.out.println(sentence12.lastIndexOf("Java"));
        System.out.println("============");

        String string11="Hello";          // convert the required character to lower or upper case
                                         // System.out.println(string11.length());
        string11=string11.toUpperCase();

        System.out.print(string11.charAt(0));
        System.out.println(string11.charAt(1));

        System.out.println(string11.charAt(0)+string11.charAt(1)); // adding of letter H(72) and E(69) in
        // if we want to replace some part of the string we need to use   replace() or replaceFirst()

        String sentence3="Java is a hard programing language java.";
        System.out.println(sentence3.replace("hard","easy")); // needs to match one to one
        System.out.println(sentence3.replace("HArd","easy")); // needs to match one to one

        System.out.println(sentence3.replaceFirst("Java", "C.programing")); // replaceFirst change the first word in string


        // if we want to get some part of string we need to use    ' substring() ' method
                            //012345678
                 String subs="Constanta";
        System.out.println(subs.substring(1,3));    // starting from 1 to 3 , 3 is not included
        System.out.println(subs.substring(0,3));   // starts from 2 and goes to till 2 included
        System.out.println(subs.substring(2)); // stating from 2 to .......

        Scanner scanner=new Scanner(System.in); // min. two letters must be used
        String word=scanner.next();
        String result="";
        if (word.length()<=2){
            result=word;
        }else
        System.out.println(word.substring(1,4));
        //if we want to multiple(repeat) one word we need to use " repeat() " method
        String texting="Aydin";
        System.out.println(texting.repeat(3));
        // it used for to check empty or not, we need to use isEmpty() method
        String emptyWord="   .    ";
        System.out.println(emptyWord.isEmpty()); // empty method checking character
        String blankWord="      ";
        System.out.println(blankWord.isBlank());// comparing two value we can use
        //  ' equals() ' case about lower or upper case

        String string123="Word";
        String string124="word";
        System.out.println(string123.equalsIgnoreCase(string124));
        System.out.println(string123.equals(string124));

// startWith() method is using for checking the string is starting with given sequesnce or not  endWith() method is using for chaking the string is ending with given char sequence or not

  String sentences=" Java is a good language";
        System.out.println(sentences.startsWith("java"));
        System.out.println(sentences.endsWith("language"));


    }
}
