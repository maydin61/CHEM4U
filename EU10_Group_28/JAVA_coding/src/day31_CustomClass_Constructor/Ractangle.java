package day31_CustomClass_Constructor;

public class Ractangle {

    public double length, width;

    public Ractangle(double length, double width) {       // constructor must for the code
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }


    public String toString() {
        return "Ractagle{" +
                "length=" + length +
                ", width=" + width +
                ", calculateArea=" + calculateArea() +
                ", calculatePerimeter=" + calculatePerimeter() +
                '}';
    }
}
