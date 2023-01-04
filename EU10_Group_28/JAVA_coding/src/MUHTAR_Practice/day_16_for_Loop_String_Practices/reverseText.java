package JAVA_coding.src.MUHTAR_Practice.day_16_for_Loop_String_Practices;

public class reverseText {
    public static void main(String[] args) {
        String sentence="Wooden Spoon";
        String sentence2="Muhammet Aydin";

        int length=sentence2.length();

        String result="";

        for (int i = length-1; i >=0 ; i--) {

           result+= sentence2.charAt(i);   // adding from last to one before right to left addition
        }
        System.out.println(result);
        System.out.println("number of characters :"+length);
    }
}
