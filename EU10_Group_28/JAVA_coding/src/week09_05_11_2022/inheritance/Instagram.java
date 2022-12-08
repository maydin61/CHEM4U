package week09_05_11_2022.inheritance;


public class Instagram extends MobileApp{


    MobileApp mobileApp=new MobileApp("Instagram",2.5);


    public Instagram(String name, double version) {
        super("Instagram", version);
        System.out.println(mobileApp);
    }
}
