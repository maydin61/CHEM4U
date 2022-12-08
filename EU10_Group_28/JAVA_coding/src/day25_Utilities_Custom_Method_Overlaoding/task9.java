package day25_Utilities_Custom_Method_Overlaoding;

public class task9 {
    public static void main(String[] args) {
        String z="popcorn";
                   z=z.substring(1,7);
                  // z=z.substring(1,8);
        if (z.equals("opcao")){
            System.out.println(z.length());
        }else{
            System.out.print(z.replace("o", "a"));
        }
    }
}
