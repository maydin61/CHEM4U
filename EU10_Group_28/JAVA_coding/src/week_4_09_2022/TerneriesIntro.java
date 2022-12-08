package week_4_09_2022;

public class TerneriesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("even number"); // string
        } else {
            System.out.println("odd number"); // string
        }
        System.out.println("======================");

        String result1 = (n % 2 == 0) ? "even number" : "odd number";
        // if statement (n % 2 == 0)?              : used for else statement,
        // to use value again attach to a variable
        System.out.println(result1);

        System.out.println("======================");


        int age = 23;

        if (age >= 21) {
            System.out.println("alienable");
        } else {
            System.out.println("not alienable");


        }
        System.out.println("======================");
        String result2 = (age >= 21) ? "AAalienable" : "NNnot alienable";
                {
                    System.out.println(result2);
                }
    }
}
