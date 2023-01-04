package JAVA_coding.src.MUHTAR_Practice.day31_CustomClass_Constructor;

public class PizzaTask {

    public char  sizeOfPizza;
    public int numberOfCheeseTopping, getNumberOfPepperoniTopping;

    public PizzaTask(char sizeOfPizza, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {

        this.sizeOfPizza = sizeOfPizza;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
    }

    public String toString() {
        return "PizzaTask{" +
                "sizeOfPizza=" + sizeOfPizza +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping + // copy pass to add another line of print statement
                ", getNumberOfPepperoniTopping=" + calcCost() +
                ", totalPrice= $" +  +
                '}';
    }


    public  double calcCost(){
        double startingPrice = (sizeOfPizza == 'S')?10:(sizeOfPizza == 'M')?12:14;
        double totalPrice =startingPrice + numberOfCheeseTopping*2+numberOfCheeseTopping*2;

        return totalPrice;
    }
}
