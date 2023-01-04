package JAVA_coding.src.PracticeWith_ADAM.week_02_09_2022;

public class primitiveIntro {
    public static void main(String[] args) {

        /*
Variable date types
1-Primitive
    -Numerical primitives
    double>float>long>int>short>byte      "6 numerical"
    -boolean       conditions true /false
    -char          charters '......'         like=>   '%'   "2 string "






2-Non Primitive
    only String "Sequence of character"


         */

        byte age = 51;
        int age2 = 120;
        long myLong = 0;
        int i = (int) myLong;
        myLong = (long) 123_434f;
        float myFloat = (float) 3.2423456E07d; // f or F used to conversion of float data type
        System.out.println(age + age2);
        System.out.println(myLong);
        System.out.println(myFloat);
    }
}
