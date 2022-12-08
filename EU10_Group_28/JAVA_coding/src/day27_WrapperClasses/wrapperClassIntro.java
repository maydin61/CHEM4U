package day27_WrapperClasses;

public class wrapperClassIntro {
    public static void main(String[] args) {
        int num= 200;

        Integer num1 = num;  // autoboxing
        System.out.println(num1);
        int num2=num1;    // unboxing
        System.out.println("==========");

        Integer integerValue = 100;
        // Long longValue = integerValue;
        Long LongValue = Long.valueOf(integerValue);

        System.out.println(" ==================");
        int num3=300;
       // Long l2=num3;
        Integer num4 = num3;
        Byte b1=25;
        byte bb1=b1;
        short sh=bb1;
        int intt=sh;
        long l=intt;
        Long l5= Long.valueOf(num3);

        // parse methods ==> String to another data type primitive
        // valueOf method

        // "23424" ==> Siring not used in math (integer number) calculation

    }
}
