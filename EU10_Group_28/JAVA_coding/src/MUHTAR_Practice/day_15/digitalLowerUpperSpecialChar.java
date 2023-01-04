package JAVA_coding.src.MUHTAR_Practice.day_15;

import java.util.Scanner;

public class digitalLowerUpperSpecialChar {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        scanner.close();
        // Aydin123
        // 01234567
        char firstChar = word.charAt(0);

        String result = "";
        if (firstChar>=0 && firstChar<=9){
            result="digital";
        } else if (firstChar=='a' && firstChar=='z') {
            result="lower case";
        } else if (firstChar=='A' && firstChar=='Z') {
            result="upper case";
        }else {
            result="special character";
        }
        System.out.println(result);

        System.out.println("===========");
        String string="        ";
        String string22="";
        String string33=" Aydin       ";
        boolean result11=string.isBlank();
        boolean result111=string22.isBlank();
        System.out.println(result11);
        System.out.println(result111);

        boolean result12=string.isEmpty();
        boolean result122=string22.isEmpty();
        boolean resullt33=string33.isBlank();
        boolean resullt333=string33.isEmpty();

        System.out.println(result12);
        System.out.println(result122);
        System.out.println(resullt33);
        System.out.println(resullt333);


    }
}