package Array_List_Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueCharactersStringToArrayList {
    public static void main(String[] args) {

        String str = "accsdaesdddasdfdg13";
       uniqueElementsInString(str);
       String str2 = "eroblggbcb";
       uniqueElement0(str2);

    }
    public static ArrayList<String> uniqueElementsInString(String str){
        ArrayList < String  > list= new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list = " + list);
        list.removeIf(each ->  Collections.frequency(list,each) >1 );
        System.out.println("list = " + list);

        return list;
    }
    public static String[] uniqueElement0(String str) {
        String[] array = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));

        String unique = "";

        for (String each : list) {
            boolean removeIf = list.removeIf(p -> Collections.frequency(list, p) > 1);
            {
                unique += each;
            }
        }
        System.out.println("unique = " + unique);
        return array;
    }
}
