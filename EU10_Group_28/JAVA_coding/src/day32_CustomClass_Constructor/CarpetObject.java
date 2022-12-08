package day32_CustomClass_Constructor;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet carpet1=new Carpet(2.5,3.0,10,true);
        Carpet carpet2=new Carpet(3.5,4.0,7.3,false);

        System.out.println("carpet1 = " + carpet1);
        System.out.println("carpet2 = " + carpet2);

        System.out.println("carpet1.calculationCost() = " + carpet1.calculationCost());
        System.out.println("carpet2.calculationCost() = " + carpet2.calculationCost());

        System.out.println("carpet1.isPersian = " + carpet1.isPersian);
    }
}
