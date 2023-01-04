package JAVA_coding.src.MUHTAR_Practice.day32_CustomClass_Constructor;

public class CarObject {
    public static void main(String[] args) {

        Car car1=new Car("Toyota","Rav","Black",2007,7500);

        System.out.println("car1 = " + car1);
        System.out.println("car1.brand = " + car1.brand);

        Car car2 = new Car("AUDI");
        Car car3 =new Car("WV","Golf");

        Car car5 =new Car("WV","Golf", "Green",2013,2300);
        Car car6 =new Car("Mercedes","C210",2022);

    }
}
