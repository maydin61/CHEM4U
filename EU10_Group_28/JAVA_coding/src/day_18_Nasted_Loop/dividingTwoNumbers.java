package day_18_Nasted_Loop;

public class dividingTwoNumbers {
    public static void main(String[] args) {
        int b=7, counter=0, a=40;
        while (a>=b){
            a-=b;
            counter++;
        }
        System.out.println(counter);
        System.out.println(a);
    }
}
