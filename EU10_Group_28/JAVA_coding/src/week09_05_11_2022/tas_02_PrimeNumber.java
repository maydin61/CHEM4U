package week09_05_11_2022;

public class tas_02_PrimeNumber {
    public static void main(String[] args) {
        // Write a method that can check if a number is prime or not
        // Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

        primeNumberOrNot(4);
        primeNumberOrNot(11);
        primeNumberOrNot(40);
        primeNumberOrNot(-23);
        primeNumberOrNot(2);




    }

    private static void primeNumberOrNot(int number) {
            boolean primeNumber = true;
        if (number <2){
            System.out.println("NOT prime");
        }

        for (int i = 2; i < number; i++) {
            if ( number%i == 0){
                System.out.println("NOT prime");
                break;
            }else {
                System.out.println("is prime");
            }
            return ;
        }
    }
}

