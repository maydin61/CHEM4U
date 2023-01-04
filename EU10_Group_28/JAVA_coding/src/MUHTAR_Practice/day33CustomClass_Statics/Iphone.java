package JAVA_coding.src.MUHTAR_Practice.day33CustomClass_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String OS="IOS";

    public String colour;

    public double size;

    public static String madeIn= "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasCamera = true;

    public static boolean hasFaceTime = true;

    public Iphone(String model) {
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.size = size;
    }



    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                '}';
    }
}
