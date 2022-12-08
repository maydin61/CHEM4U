package TasksGeneral_till_64;

import java.util.Scanner;

public class find_A_User_3_059 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter full name :");
        String fullName=scanner.nextLine();

        if (fullName.equalsIgnoreCase("Max Payne") ||
                    fullName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User Found!");
        }else {
            System.out.println("User NOT Found!");
        }




    }
}
