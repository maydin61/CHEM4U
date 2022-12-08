package day26_CustomMethodPractice;

public class task5_HowManyTimes {
    public static void main(String[] args) {
        String [] array={"Java", "htlm", "css", "javascript","selenium","java"};
        String targetWord="java";
        int result = countWordIArray(array, targetWord);
        System.out.println(result);

    }
    public static int countWordIArray(String [] array, String target){
        int counter=0;
        for (String eachWord:array){
            if (eachWord.equalsIgnoreCase(target)){
                counter++;
            }
        }
        return counter;
    }


}



/*
Task 5 : Target Words
  Given an Array of Strings and a target word (String) print how many times the target word is in the Array
                    Ex:
                    Input:
                        ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
                        Target: java

                        Output: 2
 */