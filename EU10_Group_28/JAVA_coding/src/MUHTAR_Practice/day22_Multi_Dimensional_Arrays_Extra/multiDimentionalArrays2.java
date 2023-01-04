package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

public class multiDimentionalArrays2 {
    public static void main(String[] args) {
        int [] x={1,2,3};
        int [] y={4,5,6,7};
        int [] z={8,9,10,11,12,13};
        for (int elementY : y) {
            System.out.println(elementY);
            System.out.println();
        }
        for (int elements : z) {
            System.out.println(elements);
            System.out.println();
        }

                            //   0         1             0               1                2
        int [] [] [] arr3D = {{{1,2,3},{4,5,6,7,}}, {{10,11,12,13,14},{17,18,19,20},{20,30,40,50,60}}};
                                //    0                             1
        for (int[][] each2D : arr3D) {
            for (int [] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element+" ");
                }
            }
        }
    }
}
