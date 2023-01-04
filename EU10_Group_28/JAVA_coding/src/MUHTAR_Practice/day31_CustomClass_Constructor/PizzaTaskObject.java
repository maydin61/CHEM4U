package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaTaskObject {
    public static void main(String[] args) {


        ArrayList < PizzaTask>  pizzas = new ArrayList<PizzaTask>();
        for (int i = 0; i < 100; i++) {
            PizzaTask small = new PizzaTask('S',2,3);
            PizzaTask medium = new PizzaTask('M',3,4);
            PizzaTask large = new PizzaTask('L',4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));
        }
        System.out.println("Total number of pizza: "+ pizzas.size());

        double totalPrice = 0;

        for (PizzaTask pizzaTask : pizzas) {
           totalPrice += pizzaTask.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);

    }
}
