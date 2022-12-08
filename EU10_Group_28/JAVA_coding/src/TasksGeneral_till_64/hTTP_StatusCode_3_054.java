package TasksGeneral_till_64;

import java.util.Scanner;

public class hTTP_StatusCode_3_054 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the status code");
        int statusCode= scan.nextInt();
        switch (statusCode){
            case 200:     // checking single case with multiple variable
                System.out.println("OK");
                break; // used to change and break out the follow
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Forbidden");
                break;
           case 410:
                System.out.println("Gone");
                break;
           case 500:
                System.out.println("Internal Server Error");
                break;
            case 303:
                System.out.println("Service Unavailable");
                break;

            default:   // like else statement final part
                System.out.println("Invalid status code");
            break;    // optional to use break comment in at the end

        }
    }
}
