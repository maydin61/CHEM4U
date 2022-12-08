package day32_CustomClass_Constructor;

public class Test {
    public Test(){                    // 1
        System.out.println("1");
    }
    public Test(int number){         // 1 3
        this();
        System.out.println("1 2");
    }
    public Test(String str){        //  1 3 Aydin
        this(34);
        System.out.println("1 2 3 ");
    }
    public Test(double d){        // 1 3 5 7.2
        this("Family");
        System.out.println("1 2 3 4 ");


    }
    public Test(char ch){
        this(4.6);
        System.out.println("1 2 3 4 5 ");
    }

    public static void main(String[] args) {
        Test test=new Test(7.2);
        System.out.println(test);

        System.out.println("----------------");
        new Test("SDET");

        System.out.println("======");
        new  Test('@');

    }
}
