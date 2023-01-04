package JAVA_coding.src.MUHTAR_Practice.day04_Varibles;

import static java.lang.System.*;

public class PrimitiveTypeCasting_conversion {
    public static void main(String[] args) {
        int a = 29;
        double b = (double)a; // implicit casting, done automatically
        float c = (float)b;
        long d = (long) b;
        out.println(a + "    conversion of decimal to non-decimal one   " + b);
        out.println(c + "   conversion of decimal to non-decimal one   " + d);
        double x = 20.523;// larger primitive to smaller one, manually done (....)
        int y = (int)x;
        out.println(x + " decimal to non-decimal one   " + y );

    }
}
