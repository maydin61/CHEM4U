package TasksGeneral_from_65_;

import java.util.Scanner;

public class email02_3_077 {
    public static void main(String[] args) {
        System.out.println("enter your email address");
        Scanner scan=new Scanner(System.in);
        String email= scan.next();
        // before the @ part of email
        // name _ surname
        // @ to . extension part ==> domain
        //  after . top extension

        String name, surname, domain, topExtension;
        int underScore, atSign, dot;
        int lengthOfEmail=email.length();
        underScore=email.indexOf("_");
        atSign=email.indexOf("@");
        dot=email.indexOf(".");

        name=email.substring(0,underScore);
        surname=email.substring(underScore+1,atSign);
        domain=email.substring(atSign+1,dot);
        topExtension=email.substring(dot+1); // ,lengthOfEmail it goes to the last character no needed adding the least one

        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Domain:"+domain);
        System.out.println("Top extension:"+topExtension);
        }

    }
