package week_06_15_10_2022;

public class countingSpace {
    public static void main(String[] args) {
        String str = " Java is Java, Java is every where";
        //0123 45 6789- ---- -- ----------

        String space = " ";
        int counterSpace = 0;

        for (int i = 0; i < str.length() - space.length(); i++) {

            String each = str.substring(i, i + space.length());

            if (each.equalsIgnoreCase(space)) // if we have only one if close we do not need to use curlicues
                counterSpace++;

        }
        System.out.println("counter Space; "+counterSpace);

        String sentence = "Java is java in everywhere is Java";

        int counter = 0;

        while (sentence.contains(" ")) {
            sentence = sentence.replaceFirst(" ", "");
            counter++;
        }
        System.out.println("counter space: "+counter + 1);



    }
}
