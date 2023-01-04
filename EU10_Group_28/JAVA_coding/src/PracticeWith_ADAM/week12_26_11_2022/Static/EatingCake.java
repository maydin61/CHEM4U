package JAVA_coding.src.PracticeWith_ADAM.week12_26_11_2022.Static;

public class EatingCake {
    public static void main(String[] args) {


        EatCake person= new EatCake();
        EatCake person1= new EatCake();
        EatCake person2= new EatCake();

        EatCake.eatCake(1);
        EatCake.eatCake(2);
        EatCake.eatCake(3);

        System.out.println("------------- without static ");

        person1.eatCake0(1);
        person2.eatCake0(3);
        person.eatCake0(2);



    }
}
