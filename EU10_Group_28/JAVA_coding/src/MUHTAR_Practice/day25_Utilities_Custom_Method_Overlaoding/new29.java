package JAVA_coding.src.MUHTAR_Practice.day25_Utilities_Custom_Method_Overlaoding;

import java.util.Arrays;

public class new29 {
    public static void main(String[] args) {

 int [] arr = {1,3,12,5,24,7,9,10};
 boolean [] bArr = new boolean[arr.length];
        for (int i = arr.length-1; i >-1 ; i--) {
            if ( arr[i]%2 ==0){
                bArr[arr.length-1-i] = true;
            }
        }
        System.out.println(Arrays.toString(bArr));
        }
    }

