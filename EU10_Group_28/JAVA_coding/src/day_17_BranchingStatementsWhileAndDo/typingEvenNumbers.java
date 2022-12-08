package day_17_BranchingStatementsWhileAndDo;

public class typingEvenNumbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i%2==0)
                continue;
            System.out.print(i+" ");
        }
        System.out.println("\n"+"===========");
        for (int i = 0; i <= 10; i++) {
            if (!(i%2==0))
                continue;
            System.out.print(i+" ");
        }
    }
}
