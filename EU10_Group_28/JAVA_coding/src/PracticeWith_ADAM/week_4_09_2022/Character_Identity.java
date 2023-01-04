package JAVA_coding.src.PracticeWith_ADAM.week_4_09_2022;

public class Character_Identity {
    public static void main(String[] args) {

        char ch = '+';
        if (ch >= '0' && ch <= '9') {
            System.out.println("digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("alphabetic");
        } else {
            System.out.println("special character : "+ch);
            System.out.println("====================");

        char ch2='^'  ;
            String result5=(ch >= '0' && ch <= '9') ?
                    "digit" :
                    ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))?
                     "alphabetic":
                     "special character";
            System.out.println("\""+result5+"\" : "+ch);
        }
    }
}