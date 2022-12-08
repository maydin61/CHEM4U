package day25_Utilities_Custom_Method_Overlaoding;

public class newTest18 {
    public static void main(String[] args) {

        String input = "today it will be 100 degrees";
    int n=0;
    while (n++ < input.length()){
        if (n==8){
            continue;
        } else if (n==9) {
            break;
        }
        System.out.println(++n);
    }
    }

}
