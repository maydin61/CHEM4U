package day_14;

public class stringMethod_Repeat {
    public static void main(String[] args) {
        String str="Aydin Muhammet_1 :";
        String str2=str.repeat(4);

        System.out.println(str.repeat(2));
        System.out.println(str2.repeat(10));
        System.out.println("Aydin,\n ".repeat(4)); // string will be repeated # of written in (4)
        System.out.println(str+("=").repeat(4)+str);

    }
}
