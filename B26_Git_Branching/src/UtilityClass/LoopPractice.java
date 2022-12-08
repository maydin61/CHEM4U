public class LoopPractice {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(i);
        }
            int x = 10;

            System.out.println(addingNumbers(x));
            System.out.print("");
            int y = 10;
            System.out.print(multipication(y));
            System.out.println("");
            int z = 5;
            System.out.println(printStars(z));



    }


    public static int addingNumbers(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
            System.out.println(i);

        }

        return sum;

    }

    public static int multipication(int number) {
        int multipication = 0;
        for (int i = 1, j = 1; i < 11; j++, i++) {
            int mlt = i * j;
        }
        return multipication;
    }

    public static int printStars(int number) {
        int nmb=number;
        for (int i = 0; i <= nmb; i++) {
            System.out.println("*".repeat(i));
        }
        return nmb;
    }
}
