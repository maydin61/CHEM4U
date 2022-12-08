package Array_List_Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int [] numbers= {1,20,1,3,8,5,16,7,11};
        System.out.println(Arrays.toString(numbers));
        howToReverseArray(numbers);
        System.out.println("Collections.frequency(numbers,1) = " + Collections.frequency(Collections.singleton(numbers), 1));
        //Collections.swap(Collections.singletonList(numbers),0,numbers.length-1);
        Arrays.sort(numbers);
        System.out.println("numbers = " + Arrays.toString(numbers));
        Collections.reverse(Collections.singletonList(numbers));
        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,9,10));
        System.out.println("list = " + list);

        howToReverseArrayList(list);

    }
    public static int [] howToReverseArray(int[] num){
        int [] newNumbers=new int[num.length];
        for (int i = num.length-1, j=0; i >=0; i--,j++) {
            newNumbers [i]+= num [j];
        }
        System.out.println(Arrays.toString(newNumbers));
        return newNumbers;

    }
    public static ArrayList<Integer> howToReverseArrayList(ArrayList arrayList){
        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = arrayList.size()-1; i >=0 ; i--) {

            int eachElement= (int) arrayList.get(i);
            reverseList.add(eachElement);

        }
        System.out.println("reverseList = " + reverseList);
        return reverseList;
    }
}
