package JAVA_coding.src.PracticeWith_ADAM.UtilityClass;

import java.util.Arrays;

public class removeElement2 {
    private static Object utilityClass;

    public static void main(String[] args) {
             int  [] arr={2,3,4,5,67,8};
             //int [] result1 = new UtilityClass.removeElement2(arr,2);

    }
    public static int [] removeElement(int [] array, int index){

        int [] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                int j=0;
                for (int each:array){
                    result[j++] = each;
                }
                result[array.length]=j;
            }
        }
        return result;
    }

}
