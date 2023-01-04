package JAVA_coding.src.MUHTAR_Practice.day_21_ArraysUtilityForEachLoop_Extra;

public class maxNumberfinding {
    public static void main(String[] args) {
        int [] numbers ={10,20,40,60,15,120};
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]){
                maxNumber=numbers[i];
            }
        }
        System.out.println(maxNumber);
        for (int each : numbers) {
            if (maxNumber<each){
                maxNumber = each;
            }
        }
        System.out.println(maxNumber);
    }
}
