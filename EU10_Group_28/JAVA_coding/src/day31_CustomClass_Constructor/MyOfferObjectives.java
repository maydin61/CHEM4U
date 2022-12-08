package day31_CustomClass_Constructor;

import UtilityClass.ReverseArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOfferObjectives {

    public static void main(String[] args) {

       Offer offer1 = new Offer();
       Offer offer2 = new Offer();
       Offer offer3 = new Offer();
       Offer offer4 = new Offer();
       Offer offer5 = new Offer();
       offer1.setINFOOffer("Bucharest","Windows","QA",65000,false,true,false,true);
       offer2.setINFOOffer("Iasi","Oracle","S.DET",75000,true,true,true,false);
       offer3.setINFOOffer("Timis","Apple","Scrum Master",130000,true,false,false,true);
       offer4.setINFOOffer("Constanta","Sony","PO",95000,true,true,true,true);
       offer5.setINFOOffer("Brasov","Philips","BA",120000,true,true,false,false);


       System.out.println(offer1);
       System.out.println(offer2);
       System.out.println(offer3);
       System.out.println(offer4);
       System.out.println(offer5);

       Offer [] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList < Offer> myOFFERS = new ArrayList<>(Arrays.asList(myOffers));
        ArrayList < Offer> fullTimeOffer = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffer.removeIf(p-> ! p.isFullTime);  // remove the offer if not full time

        System.out.println(fullTimeOffer.size());

        ArrayList < Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> ! (p.location.equals("Constanta") || p.location.equals("Bucharest")));  // removes the offer is not from Constanta
        System.out.println("localOffers = " + localOffers.size());

        ArrayList < Offer> offerBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offerBenefits.removeIf(p-> ! p.hasBenefit);
        System.out.println("offerBenefits = " + offerBenefits.size());

        ArrayList < Offer> sdetOffer = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffer.removeIf(p-> !p.jobTitle.equals("S.DET"));
        System.out.println("sdetOffer = " + sdetOffer.size());

        ArrayList < Offer> salary = new ArrayList<>(Arrays.asList(myOffers));
        salary.removeIf(p-> p.salary<100000);
        System.out.println("salary = " + salary.size());

        for (Offer each : myOFFERS) {
            System.out.println(each.companyName+" : "+ each.salary+" : "+each.jobTitle);
        }
    }
}
