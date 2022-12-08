package TasksGeneral_till_64;

import java.util.Scanner;

public class laptop_Configurator_3_056 {
    public static void main(String[] args) {

        int ram=0;
        double price=0.0, screenResolution;

        String storageType, screenType, cpu;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Size of the screen 13.3 - 15.0 - 17.0");
        double screenSize=scanner.nextDouble();
        screenSize=scanner.nextDouble();

             if (screenSize==13.3){
                price+=200;
            } else if (screenSize==15.0) {
                price+=250;
            } else if (screenSize==17.0) { //not to end condition keep on for the following ones
                 price+=400;
             }

        System.out.println("Select CPU : i3 - i5 - i7 ");
             cpu=scanner.next();
             if (cpu.equals("i3")){
                 price+=150;
             } else if (cpu.equals("i5")) {
                 price+=250;
             } else if (cpu.equals("i7")) {
                 price+=350;
             }

        System.out.println("Select RAM : 1 RAM is 12.5$ ");
        ram=scanner.nextInt();
        price += (50/4)*ram;

        System.out.println("External Memory size");
        Scanner scan=new Scanner(System.in);
        int externalMemory=scan.nextInt();

        System.out.println("Select storage memory you wanted to buy");
        storageType=scanner.next();
        if (storageType.equals("HDD")){
            price+=(externalMemory/500)*50;
        } else if (storageType.equals("SSD")) {
            price+=(externalMemory/500)*100;
        }


        System.out.println("Screen resolution you wanted to buy");
        screenType=scanner.next();

        switch(screenType) {
            case "FULL-HD":
                price+=100;
                break;

            case "4K":   //   : : : : :    use
            price+=200;
            break;



        }   System.out.println("Laptop price is: "+price);
    }

}