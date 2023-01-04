package JAVA_coding.src.MUHTAR_Practice.day27_WrapperClasses;

import java.util.Arrays;

public class removeDoublicatedString {
    public static void main(String[] args) {


        String result= removeDoublicated("aabsnddYzVb");
        System.out.println(result);
        String result2= removeDoublicated("1233mmsdfkfkf44kkerer");
        System.out.println(result2);

    }
    public static String removeDoublicated(String str){

        String newString="";
        for (int i = 0; i < str.length(); i++) {
           char eachChar= str.charAt(i);
            if( ! newString.contains(""+eachChar)){     //"" used to convert to char to string
                newString+=eachChar;
            }
        }
        return newString;
    }
}
