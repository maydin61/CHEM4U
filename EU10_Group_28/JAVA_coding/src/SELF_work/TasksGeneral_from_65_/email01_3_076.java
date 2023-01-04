package JAVA_coding.src.SELF_work.TasksGeneral_from_65_;

import java.util.Scanner;

public class email01_3_076 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("email address");
        String email=scan.nextLine();
        if ( ! email.contains("_")){  // ! not contains or true or false
            System.out.println(email);
        }else {
            //muhammmet_aydin@gmail.com
            // name start index 0 and ends right before _

            // indexOf(someStr) ==> return location of that string
            // substring (startingIndex,endingIndex)

            // lastname start right after _ and ends with the right before @ x
            // lastname  +  "_" +   firstname +   "@gmail.com"

            String firstName, lastName;

            int underScoreIndex, atSignIndex;


            underScoreIndex=email.indexOf("_");                            // location of _ sing
            atSignIndex=email.indexOf("@");                                 // location of @ sign

            firstName=email.substring(0,underScoreIndex);                     // extracting name, "underScoreIndex" not included
            lastName=email.substring(underScoreIndex+1,atSignIndex);          // "underScoreIndex+1 " extracting surname

            System.out.println(lastName+"_"+firstName+"@gmail.com");

            String extensionOfEmailaddress;
            int extension=email.length();

            extensionOfEmailaddress=email.substring(atSignIndex,extension);
            System.out.println(lastName+"_"+firstName+extensionOfEmailaddress);

        }
    }
}
