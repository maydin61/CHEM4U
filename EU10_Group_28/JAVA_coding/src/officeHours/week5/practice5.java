package OfficeHours.Week5;

public class practice5 {
    public static void main(String[] args) {
        //one();
        //four();
        five();

        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(9 - i * 2 + 1) +String.valueOf(i+1).repeat(i*2+1));
        }

        /*

          1
        222
      33333
    4444444
  555555555
 */
        System.out.println("  1".repeat(5));
        System.out.println("-------------");


        // reverse a string   practice 6
        String str="Aydin";
        String reversStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversStr += ""+str.charAt(i);

        }
        System.out.println("reversStr = " + reversStr);


        System.out.println("==============");

        // While practice
        int count = 100;
        while (count <100){
            count =count+1;
        }

        System.out.println("count = " + count);
    }
    public static void four() {

        int i;
        for (i = 0; i < 50; i++) {
            if (i % 5 != 0)
                continue;
        }
        System.out.println(i);
    }
    public static void five(){

        // a e i o u    home -->
        String word ="home";
        String  result ="";
        for (int i = 0; i < word.length(); i++) {
                 char ch=word.charAt(i);
                 if (ch =='a' || ch== 'e' || ch=='o' || ch == 'u' || ch == 'i')
                     result+=ch;

        }
        System.out.println(result);

    }

}
