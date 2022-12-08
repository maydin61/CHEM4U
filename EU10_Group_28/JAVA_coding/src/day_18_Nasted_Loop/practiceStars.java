package day_18_Nasted_Loop;

public class practiceStars {
    public static void main(String[] args) {
        String star="";
        for (int i = 0; i < 1; i++) {
            System.out.print("");
            for (int j = 0; j < 10; j++) {
                 star+="*  ";
                System.out.println(star+" ");
            }
        }
    }
}
