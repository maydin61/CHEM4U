package day27_WrapperClasses;

public class WrapperClassMethod {
    public static void main(String[] args) {

        String str="23";

        int int1= Integer.parseInt(str);

        System.out.println(int1+10);
        System.out.println(str+10);
        String str2="10.20";

        double d=Double.parseDouble(str2);
        System.out.println(d);
        System.out.println(d+12);

        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        double max1= Double.MAX_VALUE;

        double min1= Double.MIN_VALUE;

        System.out.println(max1);
        System.out.println(min1);

        Integer integerValue2= 24;
        Long longValue2= Long.valueOf(integerValue2);
        System.out.println(longValue2);
        long x=integerValue2+longValue2;
        System.out.println(x);

        int [] number= new int[]{1, 2, 3, 4, 5};
        Integer [] numbers2={1,2,3,4,5};

        //

    }
}
