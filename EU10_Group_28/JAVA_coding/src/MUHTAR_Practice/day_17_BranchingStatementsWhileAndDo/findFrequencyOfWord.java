package JAVA_coding.src.MUHTAR_Practice.day_17_BranchingStatementsWhileAndDo;

public class findFrequencyOfWord {
    public static void main(String[] args) {

        String str="Cat is Cat Dog is Dog that is Dog cat";

        int indexNumberOfString= str.length();
        String searchWord="Cat";
        int indexOfWordSearched=searchWord.length();
        int counterWord=0;

        for (int i = 0; i <= str.length()-searchWord.length(); i++) {    // -4 added to makes i addition to not
                                                                    // pass the max value f length of the word
            String eachSubs=str.substring(i,i+searchWord.length());   // +4 added for searched word length
         if (eachSubs.equals(searchWord) || eachSubs.equalsIgnoreCase(searchWord)){
             counterWord++;
         }
        }
        System.out.println(counterWord);
    }
}
