package JAVA_coding.src.PracticeWith_ADAM.week_05_4_08_10_2022;

public class stringIntro {

    public static void main(String[] args) {
       // 1.String literal

        String string1="Aydin";
        String string2="Aydin";
        System.out.println(string1==string2);

        // 2. new keyboard , data store in different memory that is why
        // result is FALSE

        String str2=new String("Aydin");
        String str3= new String("Aydin");
        System.out.println(str2==str3);


    }
}
