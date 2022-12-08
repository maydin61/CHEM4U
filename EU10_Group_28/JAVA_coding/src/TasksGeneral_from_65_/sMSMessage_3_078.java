package TasksGeneral_from_65_;

import java.util.Scanner;

public class sMSMessage_3_078 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String messageA=scan.nextLine();

        String message="<Aydin Muhammet>[202-123-3456].{I like programing and problem solving.}";

        String sender, phoneNumber, messageBody;
        //  Massage ;<Aydin Muhammet>[202-123-3456].{I like programing and problem solving.}
        // Sender: <Aydin Muhammet>     o1(opening1) c1(closing1)
        // From Number: [202-123-3456].
        //Message from: ([202-123-3456].)
        // <Aydin Muhammet>. From Number:[202-123-3456]. Message:{I like programing and problem solving.}

        int o1,o2,o3,c1,c2,c3;

        o1=message.indexOf("<");
        c1=message.indexOf(">");
        o2=message.indexOf("[");
        c2=message.indexOf("].");
        o3=message.indexOf("{");
        c3=message.indexOf("}");

        sender = message.substring(o1+1,c1);
        phoneNumber = message.substring(o2+1,c2);
        messageBody = message.substring(o3+1,c3);

        System.out.println("Sender:"+sender);
        System.out.println("Phone Number:"+phoneNumber);
        System.out.println("Message Body:"+messageBody);

    }
}
