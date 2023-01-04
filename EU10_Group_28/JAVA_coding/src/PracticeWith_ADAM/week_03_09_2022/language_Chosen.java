package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class language_Chosen {
    public static void main(String[] args) {
        System.out.println("Please enter a number for translation," +
                " eng=1, spanish=2, turkish=3, rus=4 and french=5");
        Scanner scan=new Scanner(System.in);
        Integer lng= scan.nextInt();
        String eng="Hello, thank for your call";
        String spanish="Hola, gracias para llamar";
        String turkish="Merhaba, aradiginiz icin tesekkurler";
        String rus="Privet, spasibo za vash zvonok";
        String french="Merci ,pour votre appel";
        if (lng==1) {
            System.out.println(eng);
        } else if (lng==2) {
            System.out.println(spanish);
        } else if (lng==3) {
            System.out.println(turkish);
        } else if (lng==4) {
            System.out.println(rus);
        } else System.out.println(french);

        }

    }

