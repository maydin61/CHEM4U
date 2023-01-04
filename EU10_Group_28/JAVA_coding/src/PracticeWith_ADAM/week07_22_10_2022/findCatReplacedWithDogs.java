package JAVA_coding.src.PracticeWith_ADAM.week07_22_10_2022;

public class findCatReplacedWithDogs {
    public static void main(String[] args) {
        String message="I love cats! I have a cat named Coco. My cat's very smart!";
        String searchedCat = "cat";
        String searchedDag = "dog";

        String changed = "dog";
        String result="";


        String result1=message.replace(searchedCat,changed);
        System.out.println("Solution 1: "+result1);

        int counterCat=0;
        while(message.contains(searchedCat)) {
            int indexOfFirstCat = message.indexOf("cat");

            int endOfWord = indexOfFirstCat + searchedCat.length();
            counterCat++;
            message = message.substring(0, indexOfFirstCat) + changed + message.substring(endOfWord);

            // first part of cat seem location     + changing  + rest of the word added to here

            message.substring(indexOfFirstCat, indexOfFirstCat + searchedCat.length());

            // we need to check message has cat or not, contains


            // if we have it change the cat with dog

        }

        System.out.println("Solution 2 - message :" + message);
        System.out.println("Cat: "+counterCat);

    }
}
