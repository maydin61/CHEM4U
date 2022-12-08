package TaskGeneral_from_85;

import java.util.Scanner;

public class tipCalculator_3_090 {
    public static void main(String[] args) {
        System.out.println("Would you like to split : Yes /No");
        Scanner scan=new Scanner(System.in);
        String splitOrNot= scan.next();

        System.out.println("Split :"+splitOrNot);
        String serviceQuality;
        int numberOfPeople=0, checkAmount;
        double totalAmount=0, totalTip=0, totalPerPerson=0,tipPerPerson=0;
        System.out.println("Would you like to split : Yes /No");
        if (splitOrNot.equalsIgnoreCase("yes")){
            System.out.println("number of people");
            numberOfPeople= scan.nextInt();
            System.out.println("Number of People :"+ numberOfPeople);
            System.out.println("Total pay");
            totalAmount= scan.nextDouble();
            System.out.println("Total to pay :"+ totalAmount);
            System.out.println("Service Quality : poor, fair, good, great, excellent");
            serviceQuality=scan.next();
            System.out.println("Service quality :"+ serviceQuality);

            switch (serviceQuality){
                case "poor":
                    totalTip = (totalAmount * 0.05) ;
                    break;
                case "fair":
                    totalTip = (totalAmount * 0.10);
                    break;
                case "good":
                    totalTip = (totalAmount * 0.15);
                    break;
                case "great":
                    totalTip = (totalAmount * 0.20);
                    break;
                case "excellent":
                    totalTip = (totalAmount * 0.25);
                    break;

            }
            totalPerPerson = totalAmount / numberOfPeople;
            tipPerPerson = totalTip / numberOfPeople;




        }else {

        }
        System.out.println("Number of people :"+numberOfPeople);
        System.out.println("Total to pay "+totalAmount);
        System.out.println("Total tip :"+totalTip);
        System.out.println("Total per person :"+totalPerPerson );
        System.out.println("Tip per person"+totalTip);
    }
}
