package day_14;

public class String_day_14 {
    public static void main(String[] args) {
        String str="Aydin Muhammet";
        int n1=str.indexOf("y");
        int n2=str.indexOf("mm"); // find the character one in the left
        int n3=str.indexOf("met"); // find the character one in the left
        int lastIndex= str.lastIndexOf('t');
        int lastOfLast = str.lastIndexOf("me"); // starts from right to left
        System.out.println(n1);  // we need to specify exactly position
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(lastIndex);
        System.out.println(lastOfLast);

    }
}
