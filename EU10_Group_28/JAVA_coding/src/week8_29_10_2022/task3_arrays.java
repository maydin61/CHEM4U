package week8_29_10_2022;

public class task3_arrays {
    public static void main(String[] args) {
        String [] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int counter=0;
        for (String name:names){
            String first =name.charAt(0)+"";
            String last = name.charAt(name.length()-1)+"";
            if (first.equalsIgnoreCase(last)){
                counter++;
            }
        }
        System.out.println(names+":"+counter);
    }
}
