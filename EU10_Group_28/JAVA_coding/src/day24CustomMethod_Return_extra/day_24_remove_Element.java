package day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day_24_remove_Element {
    public static void main(String[] args) {

        int remove = removeAnElement(2);
        int remove1= removeAnElement(3);


    }
    public static int removeAnElement(int skipNumber){
        int [] array = {10, 20, 30, 40, 50, 60};
        int [] newArray = new int[array.length-1];
        for (int i = 0; i < newArray.length; i++) {
           if (i==skipNumber)
               continue;
            newArray[i]=array[i];
            if (i!=skipNumber)
                newArray[i]=array[i];

        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(new int[]{array[skipNumber]}));
        return skipNumber;
    }

}
/*
	10. create a method named UtilityClass.removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2
				UtilityClass.removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */