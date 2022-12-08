package day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeAll_addAll_retainAll_contiansAll {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,55,10,20,30,30,30,10,50,50));   //   Arrays.asList  ==> convert to collection type
        System.out.println("list = " + list);
        System.out.println("--------");

        list.removeAll(Collections.singleton(30));     // removeAll  ==> remove all the given value
        System.out.println("list = " + list);
        System.out.println("--------");

        list.removeAll(Arrays.asList(10,50));  // remove the given values which is multiple ones
        System.out.println("list = " + list);
        System.out.println("--------");

        list.retainAll(Arrays.asList(40,55)); // remain only the given values rest removed
        System.out.println("list = " + list);

        ArrayList<String> jobTitle = new ArrayList<>();

        jobTitle.addAll(Arrays.asList("QA","SDET","DevOp","PO","BA","PM","FrontHand","BackHand","SDET","BA"));

        jobTitle.retainAll(Arrays.asList("QA","SDET"));
        System.out.println("jobTitle = " + jobTitle);

        System.out.println("-------");

        ArrayList< Integer> nums=new ArrayList<>();

        nums.addAll(Arrays.asList(1,20,3,4,6,7,8,9,110,22,12,323,43545,54,60));

        System.out.println("nums.contains(2) = " + nums.contains(2));
        System.out.println("nums.containsAll(Arrays.asList(20,60)) = " + nums.containsAll(Arrays.asList(2, 6)));


        String [] names = {"John","Jack","Dany","Adam"};

        ArrayList <String > namesS= new ArrayList<>();

        namesS.addAll(Arrays.asList(names));
        System.out.println(namesS);

        ArrayList <String > namesSs= new ArrayList<>(Arrays.asList(names));
        System.out.println("namesSs = " + namesSs);

        Integer [] arr = {1,2,3,4,5,6,7,8,9};
       // ArrayList <Integer> list = new ArrayList<>(Arrays.asList(arr)); not int - Integer can
        ArrayList <Integer> numbersList = new ArrayList<>(Arrays.asList(arr));

        System.out.println("numbersList = " + numbersList);
    }
    public static ArrayList<Integer> convertArrayToArrayList(int [] array){

        ArrayList<Integer> list =new ArrayList<>();
        for (Integer element : array) {
            list.add(element);
        }
        return list;
    }
}
