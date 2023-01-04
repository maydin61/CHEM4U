package JAVA_coding.src.MUHTAR_Practice.day24CustomMethod_Return_extra;

public class taskday24_removeDublicated {
    public static void main(String[] args) {

        removeDouble("aaabdscsce");
        removeDouble("Muhammet");
        String str= removeDouble("muhammet");
    }

    public static String removeDouble(String input){
        String result = "";
        input=input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if(!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        System.out.println(result);
        return result;
    }

}
/*
1. create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"
 */