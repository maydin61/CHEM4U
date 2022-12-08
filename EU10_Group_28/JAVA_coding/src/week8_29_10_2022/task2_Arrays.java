package week8_29_10_2022;

public class task2_Arrays {
    public static void main(String[] args) {
        String str3 = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] words2 = str3.split(", ");
        for (String word : words2) {
            if (word.contains(" "))     // space has words will be printed only
                // System.out.println(word.replace(" ", ""));
                System.out.println(word);
        }
        System.out.println("=========");
        String[] words0 = str3.split(", t");
        for (String word : words0) {
            System.out.println(word);
        }
        System.out.println("+++++");
        String[] words01 = str3.split(" ,   ");
        for (String word : words01) {
            System.out.println(word);
        }
    }
}