package JAVA_coding.src.MUHTAR_Practice.day_15;

import java.util.Scanner;

public class forLoopDay_15 {
    public static void main(String[] args) {

        System.out.println("Split or not to split (Yes / No)");
        Scanner scan=new Scanner(System.in);
        String yesOrNo=scan.next();
        yesOrNo=yesOrNo.toLowerCase(); // conversion to lower case

        System.out.println("Enter the check amount");
        Scanner scanner=new Scanner(System.in);
        double amount=scanner.nextDouble();

        System.out.println("How was the service (Excellent / Great / Good / Poor)");
        Scanner scanner1=new Scanner(System.in);
        String service=scanner1.nextLine().toLowerCase(); // directly converted to lower case

        double tipRate=(service.equals("excellent"))? 0.25: (service.equals("great")) ? 0.2 :
                (service.equals("good")) ? 0.15: (service.equals("poor"))? 0.10: 0.05;

        double totalTip=amount+tipRate;

        System.out.println("Number of people entered");
        Scanner scanner2=new Scanner(System.in);
        int numOfPerson=scanner2.nextInt();

        System.out.println("Total to pay:"+ amount);
        System.out.println("Total tip:"+ totalTip);

        if (yesOrNo.equals("yes")){
            System.out.println("Total per person: "+amount/numOfPerson);
            System.out.println("Tip per person:"+totalTip/numOfPerson);
        }
            scan.close();



    }
}
