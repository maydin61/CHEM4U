package JAVA_coding.src.MUHTAR_Practice.day_21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

public class arraysPrintOut {
    public static void main(String[] args) {
        String [] str={"Aydin", "Muhammet","Ahmed Hamza Aydin","Cemal Halid"};
        for (String each:str){
            int firstIndex=each.length();
            System.out.println(each.charAt(firstIndex-1)); // n t n d
            System.out.println(each.charAt(0)+".");   // // A. C.
            System.out.println(each);                // [Ahmed Hamza, Aydin, Cemal Halid, Muhammet]
        }
        System.out.println(Arrays.toString(str));    // [Aydin, Muhammet, Ahmed Hamza, Cemal Halid]
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));   //[Ahmed Hamza Aydin, Aydin, Cemal Halid, Muhammet]
        System.out.println(str[0]);   // Ahmed Hamza
    }
}
