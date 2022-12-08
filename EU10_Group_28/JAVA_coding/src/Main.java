public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*int nmb=50;

        for (int i = 0; i <= nmb; i++) {
            System.out.println(i);
        */

        char i;

        // Display the alphabets
        System.out.printf("The Alphabets from A to Z are: \n");

        // Traverse each character
        // with the help of for loop
        for (i = 'A'; i <= 'Z'; i++) {
            // Print the alphabet
            System.out.printf("%c ", i);
        }
        // Display the alphabets
        System.out.printf("\nThe Alphabets from a to z are: \n");

        // Traverse each character
        // with the help of for loop
        for (i = 'z'; i >= 'a'; i--) {
            // Print the alphabet
            System.out.printf("%c ", i);

            //int a = 10;
            //a = --a + a++ + a-- + a++;
            //System.out.print(a);
        }




        }

    }
