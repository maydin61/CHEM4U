package JAVA_coding.src.MUHTAR_Practice.day_15;

public class startsWithOrEndsWith {
    public static void main(String[] args) {
        String text="Wooden spoon";
        boolean result1=text.startsWith("Wo");
        boolean result3=text.startsWith("oo");
        System.out.println(result3);                // false
        System.out.println(result1);                 //true
        boolean result2=text.endsWith("on");
        System.out.println(result2);

        boolean result4=text.toLowerCase().startsWith("woo") ;   // true
    }
}
