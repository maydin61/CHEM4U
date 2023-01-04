package JAVA_coding.src.PracticeWith_ADAM.week12_26_11_2022.Static;

public class Static_WorkStyle {

    static {
        System.out.println("first");
    }
    static {
        System.out.println("second");
    }


    public Static_WorkStyle() {
    }

    public static void methodStatic(){            // no call, no run
        System.out.println("methodStatic");
    }


public static void main(String [] args){

}
    static {                                     // static bloc s run automatically by compiler
        System.out.println("main method");
    }
    static {
        System.out.println("third");
    }
}
