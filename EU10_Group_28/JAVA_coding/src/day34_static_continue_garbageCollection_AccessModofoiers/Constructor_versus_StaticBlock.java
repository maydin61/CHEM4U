package day34_static_continue_garbageCollection_AccessModofoiers;

public class Constructor_versus_StaticBlock {


    static {
        System.out.println("Static block");

    }
    public Constructor_versus_StaticBlock(){
        System.out.println("Constructor Block 1");
    }

    public static void main(String[] args) {
        //System.out.println("Main method");

        new Constructor_versus_StaticBlock();  // 1
        new Constructor_versus_StaticBlock(); // 2
        new Constructor_versus_StaticBlock();  //3
        new Constructor_versus_StaticBlock();  // 4
        new Constructor_versus_StaticBlock(); // 5

    }
}
