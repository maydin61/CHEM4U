package zulfiarMeeting;

import java.util.Scanner;

public class Videogame_Coupon_2_37 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of coupons");
        int coupon;
        coupon =scan.nextInt();
            if(coupon<3){
                System.out.println("Not enough coupon");
            } else {

                int candyCount = coupon/10; // number of candy
                System.out.println("Number of Candies :"+candyCount);
                int remainningCoupon= coupon%10/3;

                System.out.println("Number of Gun bells :"+remainningCoupon);

            }

       }
}
