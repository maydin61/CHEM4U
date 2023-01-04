package JAVA_coding.src.PracticeWith_ADAM.week09_05_11_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {
        // let's creat an object


        Instagram instagram1 =new Instagram("Instagram",2);

        System.out.println(instagram1);
        System.out.println("instagram1.version = " + instagram1.version);
        System.out.println("instagram1.name = " + instagram1.name);
        instagram1.useTheApp(30);

        Discord discord =new Discord(3.4);
    }
}
