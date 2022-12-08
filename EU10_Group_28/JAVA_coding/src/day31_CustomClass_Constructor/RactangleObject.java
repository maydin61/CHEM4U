package day31_CustomClass_Constructor;

public class RactangleObject {
    public static void main(String[] args) {

        Ractangle ractangle1 = new Ractangle(3,7);
        Ractangle ractangle2 = new Ractangle(6,14);

        System.out.println(ractangle1);
        System.out.println(ractangle2);
        System.out.println("================");
        System.out.println("ractangle1.calculateArea() = " + ractangle1.calculateArea());
        System.out.println("ractangle1.calculatePerimeter() = " + ractangle1.calculatePerimeter());

        System.out.println(" ------------------");
        System.out.println("ractangle1.calculateArea() = " + ractangle2.calculateArea());
        System.out.println("ractangle1.calculatePerimeter() = " + ractangle2.calculatePerimeter());

    }
}
