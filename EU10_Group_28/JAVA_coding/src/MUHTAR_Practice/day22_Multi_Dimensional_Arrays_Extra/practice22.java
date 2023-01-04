package JAVA_coding.src.MUHTAR_Practice.day22_Multi_Dimensional_Arrays_Extra;

public class practice22 {
    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (String[] each1D : items) {
            for (String element : each1D) {
                System.out.print(element+"\t");
            }
        }
    }
}
