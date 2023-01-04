package JAVA_coding.src.PracticeWith_ADAM.week09_05_11_2022;

public class task_04_removeSpace {
    public static void main(String[] args) {

        System.out.println("  Hello ");

        removeSpace("  Hello ");
        System.out.println(removeSpace("  Hello  World ?  "));

    }

    private static String removeSpace(String string) {
       String dumyVariable="";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == ' ')
                continue;                // skip the ' ' space
                dumyVariable+=ch;
        }
         return  dumyVariable;



    }
}
/*
Task 4 :    Write a method that can remove  all extra space from String , trim() is forbidden
// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

                 Input: "  Hello "
                 Output: Hello
 */