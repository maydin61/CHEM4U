package TasksGeneral_from_65_;

import java.util.Scanner;

public class print_Half_Twice_2_069 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String words=scanner.nextLine();
            int indexHalf=words.length()/2;
            String halfWords=words.substring(0,indexHalf); // substring() ==> takes the specific part of string

        System.out.println(halfWords+halfWords);


    }
}
