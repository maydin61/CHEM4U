package JAVA_coding.src.MUHTAR_Practice.day34_static_continue_garbageCollection_AccessModofoiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");
    }


    static {     // run first before anything in code block runs only once
        System.out.println("static method");

    }
    static {     // run first before anything in code block
        System.out.println("static method22");

    }
    static {     // run first before anything in code block
        System.out.println("static method333");

    }
}
