package day34_static_continue_garbageCollection_AccessModofoiers;

public class AccessModifiyerTest {

    public static void main(String[] args) {


        System.out.println(AccessModifiyers.publicData);
        System.out.println(AccessModifiyers.defaultData);

        // System.out.println(AccessModifiyers.privateData);
        // not reachable from outer of class

        AccessModifiyers.method1();

        AccessModifiyers.method2();

         // AccessModifiyers.method3();



    }
}
