package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

public class reversingArray {
    public static void main(String[] args) {
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6, 7, 8}, {8, 9, 10, 12, 45, 100}};

        for (int[] eachVariable : arr2d) {

            for (int eachOne : eachVariable) {

                System.out.print(eachOne + " ");
            }
        }
    }
}