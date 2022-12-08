package week_03_09_2022;

public class task1_AddingOrSubtractingValue {
    public static void main(String[] args) {
        int a=10;
        int b=(++a)+100;
        double c=12.5;
        System.out.println("a = " + a);
        System.out.println(a--);// 11
        System.out.println("c = " + c);
        System.out.println("c-- = " + c);
        System.out.println("a+c=   "+a+c);
        System.out.println("(a+c)=   "+(a+c));
        System.out.println("++c = " + ++c);

        System.out.println("b = " + b);
        System.out.println(a++);


        System.out.println(++a); // next line used the number here 11
        System.out.println(a+=5); // used number of a from a line before 16
        System.out.println(a-=2); // used number from line before 16-2=14
        System.out.println(a+=4); // used the number from a lines before 14+4=18



    }






}
