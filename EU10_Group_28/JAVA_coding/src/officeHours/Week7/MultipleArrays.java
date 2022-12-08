package OfficeHours.Week7;

public class MultipleArrays {
    public static void main(String[] args) {

            int[][] table = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum += table[i][j];
                }
            }
            System.out.println("sum = " + sum);

    }
}
