package day22_Multi_Dimensional_Arrays_Extra;

public class multiDimentionalArray2_reverse {
    public static void main(String[] args) {

        int [] [] arr2d={{1,2,3},{4,5,6,7,8},{8,9,10,12,45}};

        for (int i = arr2d.length - 1; i >= 0; i--) {    // i index number of last array
            for (int i1 = 0; i1 < arr2d[i].length; i1++) {
                System.out.print(arr2d[i][i1]+" ");
            }
            System.out.println();
        }
        System.out.println("====1");
        for (int j = 0; j < arr2d.length; j++) {
            for (int k = arr2d.length - 1; k >= 0; k--) {
                System.out.print(arr2d[j][k]+" ");
            }
            System.out.println();
        }
    }
}
