package week_03_09_2022;

import java.util.Scanner;
import java.util.SortedMap;

public class Task5 {
    /*Task 5: Create a class which is "CalculateCarTax"
            if the price between $20000 and $39999 taxRate=0.2
            if the price between $40000 and $59999 taxRate=0.3
            if the price between $60000 and $80000 taxRate=0.4
    */
    public static void main(String[] args) {
        System.out.println("Enter the price of your car please");
        Scanner scan = new Scanner(System.in);
        Integer priceOfCar = scan.nextInt();

                if (priceOfCar >= 60000)
        {System.out.println("taxRate is 0.4. You have to pay = " +
                    (int) (priceOfCar * 0.4) + " $");
        }  else if (priceOfCar >= 40000)
        {System.out.println("taxRate is 0.3. You have pay  =" +
                    (int) (priceOfCar * 0.3) + " $");
        }  else if (priceOfCar >= 20000)
        {System.out.println("taxRate is 0.2. You have pay  =" +
                    (int) (priceOfCar * 0.2) + " $");
        }  else System.out.println("No TAX");
    }
}
