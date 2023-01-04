package JAVA_coding.src.MUHTAR_Practice.day3;

public class String_day_15_work {
    public static void main(String[] args) {
        String message = "Adam Adam Barry Aysun Aysun";

        String searchedAdam = "Adam";
        String searchedAysun = "Aysun";
        String searchedBarry = "Barry";

        String changedAdam = "Adam";
        String changedAysun = "Aysun";
        String changedBarry = "Barry";


        int counterAdam = 0, counterAysun = 0, counterBarry = 0;

        while (message.contains(searchedAdam)) {

            int indexOfFirstAdam = message.indexOf("Adam");
            int endOfWord = indexOfFirstAdam + searchedAdam.length();
            counterAdam++;

            message = message.substring(0, indexOfFirstAdam) + changedAdam + message.substring(endOfWord);

           // message.substring(indexOfFirstAdam, indexOfFirstAdam + searchedAdam.length());



        }       System.out.println("Solution 2 - message :" + message);
              System.out.println("Adam: "+counterAdam+ message);

    }
}