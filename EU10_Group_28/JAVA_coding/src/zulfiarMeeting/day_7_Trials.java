package zulfiarMeeting;

public class day_7_Trials {
    public static void main(String[] args) {
        int a=9;
        System.out.println(++a);
        System.out.println(--a);
        System.out.println("=================");
        int b=6;
        System.out.println(b++);
        System.out.println(b--);
        System.out.println((a+=b)+"   "+ (a+b)); // a+b=...... - (a+b)+b= ....
        System.out.println(a-=b ); // a-b=
        System.out.println((a*=b)+ " "+ (a*b)); // a*b= .... - (a*b)*b= .....
        System.out.println(a%=b); // rest of division of a/b= (reminder)
        int c;
        System.out.println(c=b);
        System.out.println(0.5 * (c));
    }
}
