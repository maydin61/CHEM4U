package Questions_Unit3;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = mth9((scan.next()), scan.next(), scan.next());
        System.out.println(str);
    }
    public static char middle (String s){
        return  s.charAt(s.length()/2);
    }



    public static String mth9(String  one, String two, String three){
        return "" + middle(one) +middle(two) + middle(three);
    }
}
