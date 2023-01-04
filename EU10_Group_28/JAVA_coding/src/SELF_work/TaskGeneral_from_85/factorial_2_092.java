package JAVA_coding.src.SELF_work.TaskGeneral_from_85;

public class factorial_2_092 {
    public static void main(String[] args) {
        int n=5, sum=1;

        for (int i = 1; i <= n; i++) {
              sum = i*sum;
        }
              System.out.println(sum);
    }
}
