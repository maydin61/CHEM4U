package JAVA_coding.src.MUHTAR_Practice.Day30_CustomClass_Intro;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class CarsObjects {
    public static void main(String[] args) {
        Cars  car1= new Cars();
        car1.carBrand = "BMW";
        car1.colour = "blue";
        car1.model = "ASC 202";
        car1.price = 23000;
        car1.productionYear = 2011;


        Cars  car2= new Cars();
        car2.carBrand = "VW";
        car2.colour = "white";
        car2.model = "A202";
        car2.price = 2000;
        car2.productionYear = 2011;


        System.out.println(car1);
        System.out.println(car2);

        Cars car3 = new Cars();
        car3.carBrand = "Volvo";
        car3.colour = "Grey";
        car3.model = "A22";
        car3.price = 25000;
        car3.productionYear = 2021;
        car3.setInfoCars("TOYOTA","Avensis","Black",2007,3000);
        System.out.println(car3);


        Cars [] cars = {car2,car2,car3};

        ArrayList  <Cars> carArrayList = new ArrayList<>();

        carArrayList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carArrayList);

        for (Cars each:carArrayList){
            System.out.println(each.carBrand+ " : "+ each.price);
        }
        System.out.println("------------------");
        // recall the cars BMW 2005 -2008

        carArrayList.removeIf( p-> p.carBrand ==("BMW") && p.productionYear >=2005 && p.productionYear<=2008 );

        carArrayList.removeIf(p-> p.carBrand==("Toyota") && p.productionYear>=2000 && p.productionYear <=2020);
    }
}
