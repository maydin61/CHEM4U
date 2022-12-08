package day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class uniqueElementWithoutindexOf {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.addAll(Arrays.asList(1,2,3,4,5,3,2,4,5,6));
        System.out.println(numbersList);
        ArrayList<Integer >removeList=new ArrayList<>();

        for (Integer each : numbersList) {
            if (!removeList.contains(each))
                removeList.add(each);    // remove the doublicated ones from numbers to removeList
        }
        System.out.println(removeList);

        int frequencyOfElement=0;
        for (Integer each : numbersList) {

                for(Integer element : numbersList){
                    if (element == each){
                        frequencyOfElement++;
                    }
                }
              if (frequencyOfElement == 1){
                  System.out.println(each);
                  break;
              }
        }
    }
}
