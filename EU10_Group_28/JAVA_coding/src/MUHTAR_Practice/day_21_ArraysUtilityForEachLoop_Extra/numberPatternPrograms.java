package JAVA_coding.src.MUHTAR_Practice.day_21_ArraysUtilityForEachLoop_Extra;

public class numberPatternPrograms {
    public static void main(String[] args) {


        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        for (int i = 1, p = 1; i <= n; i++, p++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + "  ");
            }
            System.out.println();
        }
        for (int i = 1, p = 5; i <= n; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + "  ");
            }
            System.out.println();
        }
        for (int i = 1, p = 0; i <= n; i++, p += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + "  ");
            }
            System.out.println();
        }
        System.out.println("=================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("");
                    System.out.print("2 ");
                } else {
                    System.out.print("");
                    System.out.print("1 ");
                }
                System.out.println();
            }
        }
    }
}