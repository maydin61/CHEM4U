package JAVA_coding.src.MUHTAR_Practice.day32_CustomClass_Constructor;

public class Carpet {

    public double width,length,unitPrice;

    public boolean isPersian;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;


}
    public double calculationCost(){

        double totalPriceCalc= (width*length)*unitPrice;

        if (isPersian == true){
            totalPriceCalc+=200;
        }

        return totalPriceCalc;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", calculation total cost =$" + calculationCost() +
                '}';
    }


}
