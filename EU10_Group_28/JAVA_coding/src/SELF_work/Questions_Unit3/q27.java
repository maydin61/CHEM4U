package JAVA_coding.src.SELF_work.Questions_Unit3;

import java.util.ArrayList;
import java.util.Arrays;

public class q27 {
    public static void main(String[] args) {
        String[] cities = {"Boston", " Huv", "Au", "Lin", "Tulsa"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));

        int a = list.size();
        for (String str : list) {

            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            list.set(--a, rev);
        }
        System.out.println(list);
    }
}
