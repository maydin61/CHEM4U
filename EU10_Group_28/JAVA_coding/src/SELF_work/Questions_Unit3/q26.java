package JAVA_coding.src.SELF_work.Questions_Unit3;

import java.util.ArrayList;
import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList< Integer > nms =new ArrayList<>();
        int run = in.nextInt();
        while (run>0){}
        run--;
        switch (in.nextInt()){
            case 1:
                nms.add(1);
            case 5:
                nms.add(50);
                break;
            case 4:
                break;
            case 8:
                nms.remove(0);
                break;
            case 10:
            case -1:
            case -42:
                nms.add(1,0);
                break;
            case 55:
                nms.add(105);
                break;
            case 2:
                nms.add(20_000);
                break;
            default:nms.add(null);
        }
        System.out.println(nms);
    }

}
