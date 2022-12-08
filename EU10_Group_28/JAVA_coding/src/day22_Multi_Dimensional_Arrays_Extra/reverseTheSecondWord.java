package day22_Multi_Dimensional_Arrays_Extra;

public class reverseTheSecondWord {
    public static void main(String[] args) {
        String sentence = "Today IS Java";

        String [] words = sentence.split(" ");

       // System.out.println(words);
        String reverse= "", sentence1="", sentence2="",sentence3="";
        String secondWord="";

        for (int i = words[1].length()-1; i >=0 ; i--) {
           secondWord += words[1].charAt(i);
        }
       // words[1]= secondWord;
             System.out.println(secondWord);
        sentence1 = sentence.replaceFirst(words[1], secondWord);
        System.out.println(sentence1);

        String thirdWord= "";
        String newSentence="";
        for (int i = words[2].length()-1; i >= 0; i--) {
            thirdWord += words[2].charAt(i);
        }
        sentence2 = sentence.replaceFirst(words[2],thirdWord);
        System.out.println(sentence2);

        String firstWord = "";
        for (int i = words[0].length() - 1; i >= 0; i--) {
            firstWord += words[0].charAt(i);
        }
        sentence3 = sentence.replaceFirst(words[0],firstWord);

        System.out.println(sentence3.toLowerCase());
        System.out.println(sentence3.toUpperCase());


    }
}
