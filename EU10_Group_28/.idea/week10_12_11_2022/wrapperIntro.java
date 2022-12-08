import java.util.ArrayDeque;
import java.util.ArrayList;

public class wrapperIntro {
    public static <integer> void main(String[] args) {
        // int double char boolean etc....
        int a=4;
        int b=5;
        String n="100";
        String n2="200";
        String n3="32";
        System.out.println(n+n2);
        int result=Integer.parseInt(n);
        int result2=Integer.parseInt(n2);
        System.out.println(result+result2);
// what is the difference between parseInt() and valueOf()
        //valueOf() returns to an object (Wrapper Class)
        // parseInt () returns to primitive data type
        System.out.println(Integer.parseInt(n3)/4);
        Integer.valueOf(n);
        System.out.println(n3+n);

        // what is the difference bewteen autoboxing and unboxing
        // autoboxing ;primitive ........   to object ( wrapper class
        //unboxing object or wrapper .............>>>> to primitive

        int i=34;
        Integer integer1=i;   // primitive to wrapper class

        Integer integer2=35; // unboxing
        Integer ii=integer2;




    }
}
