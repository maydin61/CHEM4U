import java.util.stream.Collector;

public class task1_FindTheSentence {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
       getSentenceFromText(str);
    }
    public static String getSentenceFromText(String str) {
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           /* if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))  // CharacterIsLetter(ch) check autooticallly
                newString += ch;
            }
            System.out.println(newString);
            return newString;
        */
            if (Character.isUpperCase(ch)){
                newString+=' ';
            }
            if (Character.isAlphabetic(ch)) ;
            newString += ch;
        }
        System.out.println(newString);
        return newString;
    }
}
/*
Task 1 : Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java
 */