package JAVA_coding.src.MUHTAR_Practice.day_17_BranchingStatementsWhileAndDo;

public class whileAndDoWhileLoop {
    public static void main(String[] args) {
        String str = "AABBCaaACDDFSDfaAASSDaAA";

        char ch = 'A';
        char chB = 'B';
        int frequencyA = 0;
        int frequencyB = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachCharacterNumber = str.charAt(i);
            if (eachCharacterNumber == ch) {  // if (eachCharacterNumber == chB){
                frequencyA++;     // increasing the frequency by one each time
            }
            if (eachCharacterNumber == chB) {
                frequencyB++;     // increasing the frequency by one each time
            }
        }

        System.out.println("Frequency of Character A: " + frequencyA);
        System.out.println("Frequency of Character B: " + frequencyB);
    }
}

