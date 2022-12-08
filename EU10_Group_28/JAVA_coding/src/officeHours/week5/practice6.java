package OfficeHours.Week5;

public class practice6 {
    public static void main(String[] args) {

        // a e i o u    home --> oe
        String word ="home a lone an old movie";
        String  result ="";
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (ch =='a' || ch== 'e' || ch=='o' || ch == 'u' || ch == 'i')
                result+=ch;

        }
        System.out.println("result = " + result);
    }
}
