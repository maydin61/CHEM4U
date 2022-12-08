package Day30_CustomClass_Intro;

import java.util.ArrayList;

public class separationOfElementsToUniqueArray {
    public static void main(String[] args) {


        String str="@#$$erbTTDRBFbrgege$%^$%###$%%124ASDCFEWR";

        ArrayList< Character  > list= new ArrayList<>();

        ArrayList<Character> chars= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        onlyDigits(str);    // only digits have list
        onlyLetters(str);    // only letters have list
        specialCharacters(str);  // only characters have list




    }
    public static ArrayList <Character> onlyDigits(String string){

        ArrayList< Character  > list= new ArrayList<>();

        ArrayList<Character> chars= new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            chars.add(string.charAt(i));
        }
        ArrayList< Character  > digits= new ArrayList<>(chars);
        digits.removeIf(p-> ! Character.isDigit(p));
        System.out.println("digits = " + digits);
        System.out.println("--------------------");

        return list;


    }
    public static ArrayList <Character> onlyLetters(String string){

        ArrayList< Character  > list= new ArrayList<>();

        ArrayList<Character> chars= new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            chars.add(string.charAt(i));
        }
        ArrayList< Character  > letters= new ArrayList<>(chars);
        letters.removeIf(p-> ! Character.isLetter(p));
        System.out.println("letters = " + letters);
        System.out.println("--------------------");


        return list;
    }
    public static ArrayList <Character> specialCharacters(String string){

        ArrayList< Character  > list= new ArrayList<>();

        ArrayList<Character> chars= new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            chars.add(string.charAt(i));
        }
        ArrayList< Character  > specialChars= new ArrayList<>(chars);
        specialChars.removeIf(p->  Character.isLetterOrDigit(p));
        //specialChars.removeIf(p->  Character.isLetter(p));
        //specialChars.removeIf(p->  Character.isDigit(p));
        System.out.println("specialChars = " + specialChars);

        return list;
    }
}
