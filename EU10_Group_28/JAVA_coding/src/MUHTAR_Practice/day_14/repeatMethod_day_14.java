package JAVA_coding.src.MUHTAR_Practice.day_14;

public class repeatMethod_day_14 {
    public static void main(String[] args) {


    String str = "Aydin Muhammet";
    String str1 = str.replace("Aydin", "Muhammet");
        System.out.println(str1);
        String email="maydin@ichc.ro";
        String emailNew=email.replace("ichc","gmail");
        System.out.println(emailNew);
        String eemail=email.replace("a","x");
        System.out.println(eemail);
        String sentence="To be or not be be in be";
        String newSentence=sentence.replace("be","");
        System.out.println(sentence+" "+newSentence);
        String moto="C# is fun and C# is cool too.";
        String newMoto=moto.replaceFirst("C# is","Java");
        System.out.println(newMoto);

    }
}