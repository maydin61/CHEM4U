package JAVA_coding.src.SELF_work.Questions_Unit3;

public class ques10 {
    public static void main(String[] args) {

            double nm = add(3.4);
            nm+=add("dual");
            nm+=add(Integer.parseInt("100"));
            nm += add(11341L);
            nm+= add(Float.parseFloat("50.8"));

    }
    public static int add(int n){
        return 5;
    }
    public static double add(double d){
        return 2.5;
    }
    public static long add(String s){
        return 10;
    }
}
