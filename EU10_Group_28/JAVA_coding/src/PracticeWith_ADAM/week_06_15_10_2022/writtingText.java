package JAVA_coding.src.PracticeWith_ADAM.week_06_15_10_2022;

public class writtingText {
    public static void main(String[] args) {

        String str="Java is java in everywhere is Java ";
       String temp="";

        for (int i = 0; i < str.length() ; i++) {

            if (str.charAt(i)!=' ') {
             temp +=str.charAt(i)    ;

                System.out.print(temp);
            }
            if (str.charAt(i)==' ')

            System.out.println(temp);
             temp="";

        }

        System.out.println(temp);

    }
}
