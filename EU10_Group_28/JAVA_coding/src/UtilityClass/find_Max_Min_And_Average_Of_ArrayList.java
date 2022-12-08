package UtilityClass;

import java.util.ArrayList;
import java.util.Arrays;

public class find_Max_Min_And_Average_Of_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(Arrays.asList(1,21,30,4,53,3,2,4,35,6,-8));
        System.out.println(numbersList);

        int max= numbersList.get(0);
        int min= numbersList.get(0);
        int average= 0;

        for (Integer element : numbersList) {
            if (element>max){
                max=element;
            }
            if (element<min){
                min=element;
            }
            average+=element;
        }
        System.out.println("max. number: "+max);
        System.out.println("min. number: "+min);
        System.out.println("average on numbers: "+(double) average/numbersList.size());
    }
}
