package JAVA_coding.src.PracticeWith_ADAM.week_06_15_10_2022;

public class removeCharacter {
    public static void main(String[] args) {
        /*
        Task 5: Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

        input:
        String word="Aydin";
        int index=3;
        output:
        Adam
        */
        String sentence = "Y*78*8*o770987987u " +
                "a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t " +
                "g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e " +
                "a6575b6575o5675u567t i5467t&";

        String numbers = "";
        String letters = "";
        String characters = "";
        for (int i = 0; i < sentence.length(); i++) {       // loop of .....
            char letter = sentence.charAt(i);               // getting each character with order

            if (Character.isLetter(letter) || letter == ' ') {
                letters += letter;

            } else if (Character.isDigit(letter)) {
                numbers += letter;

            } else {
                characters += letter;
            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(characters);
    }
}
