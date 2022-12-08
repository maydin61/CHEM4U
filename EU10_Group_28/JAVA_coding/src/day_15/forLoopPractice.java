package day_15;

public class forLoopPractice {
    public static void main(String[] args) {

        for (int str = 65; str <= 90; str++) {  //alphabets A to Z ==>>65 to 90
            System.out.print((char) str + " ");
            System.out.print(" ");

        }
        for (int str2 = 91; str2 <= 110; str2++) {
            System.out.print((char) str2 + " ");
            System.out.print(" ");

        }
        for (int str3 = 122; str3 >= 97; str3--)
            System.out.print((char) str3 + " ");

        for (char i = 'A'; i <= 'Z'; i++) {  // i= A, B,CD,E, ....
            System.out.print(i+" "+"==");

        }for (char i = 'a'; i <= 'z'; i++) {  // i= a, b,c,d,e, ....
            System.out.print(i+" "+"-");

        }for (char i = 'Z'; i >= 'A'; i--) {  // i= Z, X, ....
            System.out.print(i+" ");
        }
    }
}