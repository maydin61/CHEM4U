package OfficeHours.Week8;

public class CustomMethod {
    public static void main(String[] args) {
        manualTesting("Andrei");
        webTesting("Jonh","Cassco");
        spaceCounting("please teat this for manual testing for");
        invesment(200,2,5);

    }

    public static void manualTesting(String name) {
        System.out.println(name+", please teat this for manual testing");
    }

    public static void webTesting(String name, String projectName) {
        System.out.println(name+", please teat this for manual testing for :"+ projectName+" in API");
    }

    public static void API() {
        System.out.println("This for API testing");
    }
    public static int spaceCounting(String str){
        int countSpace=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                countSpace++;

            }
        }
        System.out.println("count space: "+countSpace);
        return countSpace;
    }
    public static void invesment(double originalAmount, double rate, int year){
        double amount = originalAmount;
        for (int i = 0; i < year; i++) {
            amount += amount + amount*rate;
        }
        System.out.println("total amount :"+amount);

    }
    // we have 2 types of custom method according to what we do
    // void  type  ---> which return to anything
}
