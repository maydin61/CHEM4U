package JAVA_coding.src.MUHTAR_Practice.day_14;

public class substringMethod {
    // substring (beginning index,ending index )
    public static void main(String[] args) {
        String sentence="Aydin Muhammet Java Programing";
                       //0123456789 ...
        System.out.println(sentence.substring(1,5+1));
        System.out.println(sentence.substring(6));
    // substring (..., .......);
        // substring(...); goes till end

        String email="maydin@ichc.ro";
        String text=" Java is fun Java is cool";
                    //0123456789
        int beginText=text.indexOf(" is ");
        System.out.println(text.substring(beginText,15));

        int beginOfIndexNumber=email.indexOf("@")+1;
        int endOfIndex=email.indexOf(".");
        String domain=email.substring(beginOfIndexNumber,endOfIndex);
        System.out.println("domain:" +domain);

    String s1=sentence.substring(0,6);
    String s2=sentence.substring(sentence.indexOf("M"),sentence.indexOf("t")+1);
    String s3=sentence.substring(15);
    String s4= sentence.substring(sentence.indexOf("P"));
    String s5= sentence.substring(sentence.lastIndexOf(" "));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }
}
