package JAVA_coding.src.SELF_work.TasksGeneral_from_65_;

import java.util.Scanner;

public class onlineBookMerchant_NestedIf_3_084 {
    public static void main(String[] args) {
        int freeBooks=0;
        System.out.println("Number of books purchased monthly");
        Scanner scan=new Scanner(System.in);
        boolean isPremiumCustomer=scan.hasNextBoolean();
        int numberOfBooksPurchased=scan.nextInt();

        // Premium 1 free for every 5 books +
        //         2 free for every 8 books +
        // regular 1 free for every 7 books +
        //         2 free for every 12 books +
        if (isPremiumCustomer==true){
            if (numberOfBooksPurchased>=8){
                freeBooks=freeBooks+2;

            }else if (numberOfBooksPurchased>=5 || numberOfBooksPurchased<=7){
                 freeBooks=freeBooks+1;

            }
        }else{
            if (numberOfBooksPurchased>=12){
                freeBooks=freeBooks+2;
            }else if (numberOfBooksPurchased>=7){
                freeBooks=freeBooks+1;
            }
        }
        System.out.println("The number of free books: "+freeBooks);

    }
}
