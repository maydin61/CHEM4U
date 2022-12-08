package day_20_Arrays;

import java.util.Arrays;

public class arraysElements {
    public static void main(String[] args) {
        String news ="Almula, Aydin, Ahmed, Hafsa, Halid,";
        String [] names = new String[6];
        names[0]="Almula";
        names[1]="Aydin";
        names[2]="Ahmed";
        names[3]="Hafsa";
        names[4]="Halid";   // the same element singed as next value that is why print is the next one
        names[4]="Muhammet";  // new element was assigned that is why printed
        // names[7]="Maydin";   // not included that is why error
        System.out.println(Arrays.toString(names));
    }
}
