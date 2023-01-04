package JAVA_coding.src.MUHTAR_Practice.day27_WrapperClasses;

public class WrapperClassMethods {
    private static char element;

    public static void main(String[] args) {

        String str = "123";

        Integer num = Integer.parseInt(str);
        int num1 = num;

        System.out.println(num + 1);

        String string = "10.5";
        double d = Double.parseDouble(string);

        System.out.println(d + 3);
        int y = 234;
        Integer value = Integer.valueOf(y);
        System.out.println(y + 4);

        String s1 = "true";
        String s2 = "false";
        String s3 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);
        boolean r2 = Boolean.parseBoolean(s2);
        boolean r3 = Boolean.parseBoolean(s3);

        System.out.println(r1 + "\n " + r2 + "\n  " + r3 + " ");

        // converts String to wrapper classes
        System.out.println("===================");

        String str3 = "456";
        Integer.valueOf(str3); // converts to string value that is why sout is 4560
        System.out.println(str3 + 0);

        int z = Integer.valueOf(str3); // converts to integer value and add the value to org one
        System.out.println(z + 5);
        System.out.println("========");

        char ch = 'A';
        boolean r4 = Character.isDigit(ch);
        System.out.println(r4);
        boolean r5 = Character.isLetter(ch);
        System.out.println(r5);

        boolean r6 = !Character.isDigit(ch);
        System.out.println(r6);


        System.out.println("-----------");

        String str2 = "asf3r323rrsf445455400bfgb0cbv";
        int sum = 0;
        for (char element : str2.toCharArray()) {
            if (Character.isDigit(element)) {
                sum += Integer.parseInt(""+element);
            }
        }
        System.out.println(sum);
    }
}
