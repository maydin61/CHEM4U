package JAVA_coding.src.MUHTAR_Practice.day_21_ArraysUtilityForEachLoop_Extra;

public class forEachLoopPractice {
    public static void main(String[] args) {
        String [] words ={"Java Programing", "Cydeo School", "Wooden spoon"};
        for (String strWord : words) {
            System.out.println(strWord.charAt(0) +""+ strWord.charAt(strWord.length()-1));   // + addition
        }
    }
}
