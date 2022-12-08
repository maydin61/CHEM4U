package day22_Multi_Dimensional_Arrays_Extra;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (int i = 0; i < items.length; i++) {
            for (int i1 = 0; i1 < items.length; i1++) {
                System.out.print("\t" + Arrays.deepToString(new String[]{items[i][i1]})+"\t");
            }

            System.out.println();
        }

    }
}
