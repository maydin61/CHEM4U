package JAVA_coding.src.MUHTAR_Practice.day_15;

public class revisionFrom_day_14 {
    public static void main(String[] args) {
        //write a code replace word starts with   xydin  x with a   .
        String text="xydin";
        String newText= text.replace("x","a");
        System.out.println(newText);
        System.out.println("=========\n");
        String text2="xuhaxxet";
        String newText2=text2.replaceAll("x","m");
        System.out.println(newText2);
        System.out.println("===========\n");
        String firstname="muhaMmeT";
        String surname="AyDiN";

         firstname=""+firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
         surname=""+surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
        //                   use the first character and convert to upper+ use the 1 character and rest as lowercase
         System.out.println(firstname);
        System.out.println(surname);
        System.out.println(surname+" "+firstname);

        /*
        System.out.println(firstIndexName);
        System.out.println("=======");
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(name.toUpperCase()+" "+surname.toLowerCase());
        System.out.println(name.toLowerCase()+" "+surname.toLowerCase());

*/
    }
}
