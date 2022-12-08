package officeHours;

public class unaryOperations {
    public static void main(String[] args) {



        int a =10;
        int b=+10;
        int c=a++;
        int d=a--;
        int e=c;


        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a++); // changing value after
        System.out.println(a--);
        System.out.println(--a); // changing value immediately

        int f=12;
        System.out.println(++f);
        int k=14;
        k++;  // still 14
        System.out.println(k--);    // is 13

        int g=200;
        System.out.println(g++ + g);

        int h=200;
        System.out.println(++h + h);
                          //201 +201

    }
}
