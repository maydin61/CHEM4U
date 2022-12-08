package day_20_Arrays;

import java.util.Arrays;

public class paractice3 {
    public static void main(String[] args) {
        String [] str= {"Aydin Muhammet", "Ahmet Hamza", "Hafsa Aydin", "Erenay Hafsa"};

        for (int i = 0; i < str.length; i++) {
            for (int j = str.length - 1; j >= 0; j--){
            String reverse="";
            reverse+=str[i].charAt(j);
            }
            System.out.println(Arrays.toString(str));
        }
    }
}
