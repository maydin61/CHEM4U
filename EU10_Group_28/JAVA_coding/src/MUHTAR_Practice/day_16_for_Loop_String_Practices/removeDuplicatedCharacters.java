package JAVA_coding.src.MUHTAR_Practice.day_16_for_Loop_String_Practices;

public class removeDuplicatedCharacters {
    public static void main(String[] args) {

        String str="AAWABBCCDWW";

        String result="";

        for (int i = 0; i <str.length()-1 ; i++) {

            String ch = ""+ str.charAt(i);  // ***  every character to convert string one ==> " "

            if ( ! result.contains(ch) ) {   // ! not contains then added
                result += ch;
            }
        } System.out.println(result);
    }
}
