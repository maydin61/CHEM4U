package week07_22_10_2022;

import java.util.Scanner;

public class countEachName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String sentence=scanner.nextLine();

        String search = "Adam";

        int countAdam=0;
        while (sentence.contains(search)){
            countAdam++;

        }
        System.out.println(countAdam);


    }
}


/*
Task 3: Count each name in sentence.
   input :
  String names = "Adam Adam Barry Aysun Aysun";
  output:
    Adam-2 Barry-1 Aysun-2
 */