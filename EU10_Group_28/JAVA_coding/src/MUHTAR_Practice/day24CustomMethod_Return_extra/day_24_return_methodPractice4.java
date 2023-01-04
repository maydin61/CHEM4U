package JAVA_coding.src.MUHTAR_Practice.day24CustomMethod_Return_extra;

public class day_24_return_methodPractice4 {
    public static void main(String[] args) {

        String string = removeDublicate("aabcdss");
        string= removeDublicate(string);
        System.out.println(string);
    }


    public static String removeDublicate(String str) {   // "aacbddd"   "abcd"
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }
        return result;
    }
}
