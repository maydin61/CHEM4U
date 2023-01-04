package JAVA_coding.src.PracticeWith_ADAM.UtilityClass;

public class mergeTwoArray {
    public static void main(String[] args) {


    }
    public static int [] mergeTwoArrays(int [] arr1, int [] arr2){
        int [] result = new int[arr1.length+ arr2.length];
        int i=0;
        for (int each:arr1) {
            result [i++]=each;
        }
        for(int each:arr2){
            result[i++]=each;
        }
        return result;
    }
}
