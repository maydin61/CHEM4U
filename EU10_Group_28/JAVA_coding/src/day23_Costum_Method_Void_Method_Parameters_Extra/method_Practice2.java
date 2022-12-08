package day23_Costum_Method_Void_Method_Parameters_Extra;

public class method_Practice2 {
    // creat a function that can print hello world 5 times
    // ............................... hello Cydeo.
    public static void helloWorld(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public static void helloCydeo(){
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello Cydeo");
    }
}

    public static void main(String[] args) {
        helloWorld();
        helloCydeo();

        helloAydin("Aydin Muhammet");
        helloAydin("Aydin Ahmed Hamza");
        helloAydin("Aydin Hafsa Erenay");
        evenNumber();

    }

    private static void helloAydin(String str) {
        System.out.println(str);
    }

    // creat a method that can print the even number from 0 to 10 evenNumbers
    public static void evenNumber(){
        for (int i = 0; i < 11; i+=2) {

            System.out.print(i+" ");
        }
    }
}
