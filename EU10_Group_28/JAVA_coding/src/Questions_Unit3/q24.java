package Questions_Unit3;

import java.util.ArrayList;
import java.util.Arrays;

public class q24 {
    public static void main(String[] args) {
        ArrayList < Integer> nm =new ArrayList<>();
        nm.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s="";
        for (int i = 0; i < nm.size(); i++) {
            if (i == 2 || i ==5 || i ==9){
                continue;
            }
            if (nm.get(i) == 2 || nm.get(i) % 3 == 0){
                s+="1";
            }else {
                s+="0";
            }
        }
        System.out.println(s);

    }
}
