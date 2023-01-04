package JAVA_coding.src.PracticeWith_ADAM.week_06_15_10_2022;

public class T1_countSpecificWords {
    public static void main(String[] args) {

        String sentence = "Java is java, JAva is every where";
                         //0123 45 6789- ---- -- ----------

        String word = "Java";
        int counter = 0;

        for (int i = 0; i < sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());
            if (each.equalsIgnoreCase(word))       // if we have only one if close we do not need to use curlicues
                counter++;
        } System.out.println(counter);


    }
}