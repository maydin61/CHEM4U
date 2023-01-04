package JAVA_coding.src.MUHTAR_Practice.day_16_for_Loop_String_Practices;

public class writeDownOnlyNotRepeatedOnes {
    public static void main(String[] args) {
        String str="Muhammet Aydin !2334353557";  // if the first and last character are the same, then it is unique.
                                // if not repeated
        String result="";   // expected result and print out
        int length=str.length();

        for (char i =0;     i <str.length() ;       i++) { //find the index number

            char ch = str.charAt(i);  // taking the character as ch and use it for next step to compare with the last one

             if ( str.indexOf(ch) == str.lastIndexOf(ch)){  // first and last character is the unique
                result+=ch;
        }
        }
        System.out.println(result);
    }
}
