package JAVA_coding.src.MUHTAR_Practice.day04_Varibles;

import java.util.Scanner;

import static java.lang.System.out;

public class task_14 {
    public static void main(String[] args) {
        // input for the data new
        out.println("Use a number below the paragraph");
        String word = new Scanner(System.in).nextLine();
        out.println("Today's World-f-Day-Day is :" + word);
        // ===============
// enter new data about i and f value
        out.println("Input to values for i and f in th following paragraph");

        Scanner scan=new Scanner(System.in);
        // makes running of i and f value in console

        float pi= (float) 3.14;

        int i=scan.nextInt();
        float f=scan.nextFloat();
        out.println("radius of i="+i+" radius of f="+f);
        int j= (int) (i*f);

        out.println(j+" is the multiplication RESULT of i with f");
        out.println("Perimeter calculation of i value has circle :"+2*i*pi);
        out.println("Perimeter calculation if f value has circle :"+2*f*pi);
        out.println("Area calculation if f value has circle :"+f*f*pi);
        out.println("Area calculation if i value has circle :"+i*i*pi);
    }






}
