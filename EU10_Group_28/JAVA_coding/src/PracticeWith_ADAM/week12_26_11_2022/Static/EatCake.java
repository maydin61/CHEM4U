package JAVA_coding.src.PracticeWith_ADAM.week12_26_11_2022.Static;

public class EatCake {


    public static int totalSlices = 10;

    public static void eatCake(int eatSlides) {
        totalSlices -= eatSlides;

        System.out.println("remanining slides : " + totalSlices);
    }

    public int totalSlices0 = 10;   // remove the static makes the all the cake separated as

    public void eatCake0(int eatSlides) {
        totalSlices0 -= eatSlides;

        System.out.println("remanining slides : " + totalSlices0);


    }
}
