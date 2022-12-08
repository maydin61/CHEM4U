package week09_05_11_2022.inheritance;

public class MobileApp {

    public String name;
    public  double version;

    // initial the code
    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }
    // use the app
    public void  useTheApp(int minutes){
        System.out.println("The user is using "+name+"application for" +minutes+"minutes");
    }
    public void downLoad(){
        System.out.println( name+ "Application is downloading by the user");

    }

    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
/*
 Task 3: appTask:
        Create a class called MobileApp
            instance variables:

                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub_classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)
 */