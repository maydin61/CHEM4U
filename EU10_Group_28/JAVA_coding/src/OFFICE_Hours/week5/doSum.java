package OfficeHours.Week5;

public class doSum {

    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
        doSum(3,4);
        doSum(1,1);

    }


    public static void doSum(Integer x, Integer y) {

        System.out.println("Integer sum is " + (int)(x + y));
    }

    public static void doSum(double x, double y) {

        System.out.println("double sum is " + (int)(x + y));
    }

    public static void doSum(float x, float y) {

        System.out.println("float sum is " + (int)(x + y));
    }

}
