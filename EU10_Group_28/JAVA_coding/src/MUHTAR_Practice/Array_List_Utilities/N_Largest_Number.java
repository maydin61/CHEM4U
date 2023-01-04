package JAVA_coding.src.MUHTAR_Practice.Array_List_Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class N_Largest_Number {
    public static void main(String[] args) {

        ArrayList< Integer> arrayList=new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5,7,10,10,15,6,7,8,9));


        int n=2;                // the biggest number ask on list
        if (n == 1){
            int max= Collections.max(arrayList);
        }else {
            for (int i = 1; i < n; i++) {
                arrayList.removeIf(p -> Collections.max(arrayList) == p);
                int max = Collections.max(arrayList);
            }
        }
        int max = Collections.max(arrayList);

        System.out.println("max = " + max);
    }
}


/*
write a program that can return the n th. largest number from an arraylist
arraylist = {1,2,3,4,5,6,7,8,9}
n=5
output; 4
 */