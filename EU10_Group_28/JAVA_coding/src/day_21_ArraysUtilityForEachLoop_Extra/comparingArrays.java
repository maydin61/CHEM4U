package day_21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

public class comparingArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 3, 2};
        boolean r1 = Arrays.equals(array1,array2)   ;  // comparing the two array Arrays.equals(arr1 ,aar2 );
        System.out.println(r1);                                // must be attached to boolean true or false

        Arrays.sort(array2); // 1,2,3
        Arrays.sort(array1); // 1,2,3
        boolean r2 =Arrays.equals(array1,array2);
        System.out.println(r2);
        System.out.println("========================");
        char [] ch1={'a','c','b'};
        char [] ch2 ={'b','a','c'};
        boolean r3=Arrays.equals(ch1,ch2);
        System.out.println(r3);
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r4=Arrays.equals(ch1,ch2);
        System.out.println(r4);
        // Anagram   listen ====> silent
        //           heart  ====>  earth
        char [] ch3={'l', 'i','s','t','e','n'};
        char [] ch4={'n', 'i','s','t','e','l'};
        Arrays.sort(ch3);
        Arrays.sort(ch4);
        boolean anagram= Arrays.equals(ch3,ch4);
        System.out.println(anagram);
        String [] str = {"Learning java is fun"};


        Arrays.stream(str).toArray();
        System.out.println(Arrays.toString(str));
        int length=str.length;
        System.out.println(str[0]);
    }
}