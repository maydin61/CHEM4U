package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

public class alphabeticOrDigital {
    public static void main(String[] args) {
        char ch = 55;
        String text = "";
        if (ch >= 48 && ch <= 57) {
            text = "Digit";
        } else if (ch >= 65 && ch <= 90) {
               text = "Alphabetic";
        }else if (ch >= 97 && ch <= 122){
            text = "Alphabetic";
        }System.out.println(text);
        }
    }
