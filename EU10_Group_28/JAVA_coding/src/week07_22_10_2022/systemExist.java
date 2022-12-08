package week07_22_10_2022;

public class systemExist {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
                //System.exit(2);
            }
            System.out.print(i + " - ");

        }
        System.out.println();
        System.out.println("after break");
    }
}