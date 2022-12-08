package week_03_09_2022;

public class FindTheResult {
    public static void main(String[] args) {
        int a = 15;

        boolean divisibleBy3    = a % 3 == 0;
        boolean divisibleBy5    = a % 5 == 0;
        boolean divisibleBy15   = a % 15 == 0;
        if (divisibleBy3) {
            System.out.println(a + " divisible by 3 = "  + (a+20));
        } else if (divisibleBy5) {
                    System.out.println(a + " divisible by 5 = " +  (a+25));
        }else if(divisibleBy15)
                    System.out.println(a + " divisible by 15 = " + (a+50));
    }
}
