package officeHours;

public class logicalOperations {
    public static void main(String[] args) {
        // !  not equals to          || or                  && and
        System.out.println(true);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(!true);
        System.out.println(!false);
        int x=20;
        int y=10;
        double z=x++ - y *7 / y-- + x * 10;
        System.out.println(z);


    }
}
