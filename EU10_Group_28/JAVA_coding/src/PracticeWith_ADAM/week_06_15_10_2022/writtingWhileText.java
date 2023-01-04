package JAVA_coding.src.PracticeWith_ADAM.week_06_15_10_2022;

public class writtingWhileText {
    public static void main(String[] args) {
        String str="Java is Java in every where Java";
        String word="Java";
        int counter=0;

        while (str.contains(word)){
            counter++;
            str=str.replaceFirst("Java", "");
        }
        System.out.println(counter);
        System.out.println(str);
    }
}
