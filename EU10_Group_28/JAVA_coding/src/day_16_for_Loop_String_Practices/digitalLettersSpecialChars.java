package day_16_for_Loop_String_Practices;

public class digitalLettersSpecialChars {
    public static void main(String[] args) {
    String str="Cydeoo Wooden Spoon 123142#$%345Tfgh%";

    String digits="";
    String letters="";
    String specialChars="";

        for (int i = 0; i < str.length(); i++) {      // index number first to last one


            char ch = str.charAt(i);  // every single characters were listed.

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letters += ch;

            } else {
                specialChars += ch;
            }
           // System.out.println(ch);

            System.out.print("");
        }System.out.println("digits: "+digits);
        System.out.println("letters: "+letters);
        System.out.println("special characters: "+specialChars);
    }
}
