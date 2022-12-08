package TasksGeneral_till_64;

import java.util.Scanner;

public class weekDays_3_057 {
    public static void main(String[] args) {
        System.out.println("Enter day number");
        Scanner scan=new Scanner(System.in);
        int dayNumber= scan.nextInt();
        String result;
        switch (dayNumber){
            case 1 :
                result="Monday";
                break;
            case 2 :
                result= "Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            default:
                result="Sunday";


        }
        System.out.println(result=result.toUpperCase());
    }
}
