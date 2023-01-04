package JAVA_coding.src.MUHTAR_Practice.day_15;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        String word="aydin";
        String word2="Aydin";
        String word3="AyDiN";
        boolean result= word.equals("aydin");
        boolean result3= word.equals("Aydin");

        System.out.println(word.equals(word2)); // false   aydin ! = Aydin

        boolean result2= word2.equalsIgnoreCase("Aydin"); // true, ignore the case sensitive
        System.out.println(result+"\t"+result2+"\t"+result3);
        boolean result5=word.equalsIgnoreCase(word3); // result will be true because of ignoring case
        System.out.println(result5);
        System.out.println("===========");

        String sentence="Merhabalar Kostence Ma";

        boolean result66=sentence.contains("Ma");
        System.out.println(result66);

        boolean result69=sentence.contains("Java");
        System.out.println(result69);

        boolean rslt=sentence.toLowerCase().contains("ma");
        System.out.println(rslt);
        System.out.println("------------");
        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false
        System.out.println(input1.contains("Java")); // true

        System.out.println(input2.contains("JaVa")); // FALSE

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

    }
}
