package JAVA_coding.src.SELF_work.Questions_Unit3;

import java.util.ArrayList;

public class q23 {
    public static void main(String[] args) {
        ArrayList <String > strs = new ArrayList<>();

        strs.add("j");
        strs.add(0,"1");
        strs.add("i");
        strs.add(2,"5");
        strs.remove(1);
        strs.add("e");
        strs.add("i");
        strs.remove("i");

        System.out.println(strs);

    }
}
