package day_21_ArraysUtilityForEachLoop_Extra;

public class finding_unique_Elements {
    public static void main(String[] args) {
        
        String [] str={"Aydin", "Hamza", "Halid", "Aydin","Hamza","Hamza","HALID"};

        for (String each : str) {
            int count = 0;
            for (String strSingle : str) {
                if (strSingle.equals(each)) {
                    count++;
                }

            } if (count == 1){
                System.out.println("unique data: "+each);
            } if (count >= 2){
                System.out.println("is not unique :"+each);
            }
        }
    }
}
