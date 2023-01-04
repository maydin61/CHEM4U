package JAVA_coding.src.MUHTAR_Practice.day32_CustomClass_Constructor;

public class Car {
    public String brand,model,colour ;
    public int year ;
    public double price ;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this (brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, String colour, int year, double price) {
        this(brand, model, year, price);
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }
}
