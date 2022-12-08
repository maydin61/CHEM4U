package day_21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

public class minAndMaxNumbers {
    public static void main(String[] args) {
        int [] numberList = {4,5,7,-3,90,78,75,};
        Arrays.sort(numberList);
        int lengthOf=numberList.length;
        int sum=0;
        System.out.println(numberList[lengthOf-1]);
        System.out.println(numberList[0]);
        for (int each:numberList){
            sum=sum+each;
        }
        System.out.println(sum);
        System.out.println(sum/(lengthOf+1));
    }
}
