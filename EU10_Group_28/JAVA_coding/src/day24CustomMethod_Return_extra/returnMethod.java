package day24CustomMethod_Return_extra;

public class returnMethod {

    public static void main(String[] args) {
        reverse("Aydin");
        reverse("Aydin Muhammet");
        firstLetters("Cemal", "Halid");
    }



    public static String reverse(String text){
        String reverse="";
        for (int i=text.length()-1; i >=0 ; i--) {
            reverse+=text.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }
    public static void firstLetters(String text, String text2){
        System.out.println(text.substring(0,1));
        System.out.println(text2.substring(0,1));

    }

}
