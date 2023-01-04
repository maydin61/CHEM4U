package JAVA_coding.src.MUHTAR_Practice.day21_ArraysUtilityForEachLoop_Extra;

public class addingOfMultipleArrays {
    public static void main(String[] args) {

        String [] items = {"shoes", "Jackets", "Gloves"};
        double [] prices = {10.90 , 40.089 , 60.56};
        int [] numberOfItems = {2,5,7};



        for (int i = 0; i < items.length; i++) {

            String item = items[i];
            double price = prices[i];
            int     numberOfItem = numberOfItems[i];
            System.out.println(item + " -"+ price+" $" +"    :"+numberOfItem+ " = "+price*numberOfItem );
        }

    }
}
