package zulfiarMeeting;

public class CircleCurrencyConversion {
    public static void main(String[] args) {
        double PI = 3.14; // Pi constant
        double radius = 4; // radius of circle
        double l = 5.7;
        double area = PI * (radius * radius) * l;
        double diameter = radius * 2;
        double perimeter = 2 * radius * PI;
        System.out.println("Radius of cirle is; " + radius);
        System.out.println("Diameter is; " + diameter);
        System.out.println("Perimeter is; " + perimeter);
        System.out.println("Area is; " + area);
        {
            double dollar = 100.45;// amount of money to convert
            double euro = 120.56;
            double lira = dollar * 18.08;

            System.out.println("Conversion to lira      ;" + lira);
            int kg = 120;
            double lb = kg * 2.2;// lb:pounds
            double kg2 = lb * 1 / 2.2;
            System.out.println("Kilo(kg) to pounds(lb) conversion   ;" + lb);
            System.out.println("pounds:" + kg2);
            char ch12 = 45098;
            String ch10 = "True";
            String ch11 = "False";
            System.out.println(diameter > radius);
            System.out.println(ch12);

        }
    }
}
