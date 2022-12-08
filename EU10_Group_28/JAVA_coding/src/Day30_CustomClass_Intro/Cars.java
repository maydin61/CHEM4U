package Day30_CustomClass_Intro;

public class Cars {
    public String carBrand;
    public String model;
    public String colour;
    public int productionYear;
    public int price;


    public void setInfoCars(String carBrand, String  model, String colour, int productionYear, int price) {
        carBrand = carBrand;
        model = model;
        colour = colour;
        productionYear = productionYear;
        price = price;

    }
    public void drive(){
        System.out.println(carBrand+" is drive");
    }
    public void start(){
        System.out.println(carBrand+" is start");
    }
    public void stop(){
        System.out.println(carBrand+" is stop");
    }

    public String toString() {
        return "Cars{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                '}';
    }
}
