import java.util.Scanner;

public class revisionClass_167_11_2022 {
    public static void main(String[] args) {
        String str1="Java";
        String str2=new String("Java");
        Scanner scan=new Scanner(System.in);
        String str3 ="Java !!";
                  // 01234567  index number
        System.out.println(str1.equals(str2)); // has the same value
        System.out.println(str1 == str2);      // they are not equals to each other, not only value all perspective

        String s3=str1;
        System.out.println(str1 == s3);

        s3="bag";
        System.out.println(s3);


        System.out.println("house ".length());
        System.out.println("house ".charAt(3));
        System.out.println("hoooouse ".repeat('2'));

        System.out.println("hoooouse  is nice".trim());   //delete initial and final part


        System.out.println("is nice".startsWith("i"));

        System.out.println("hoooouse  is nice".replace(" ", "*"));   //delete initial and final part

        System.out.println("hoooouse  is nice".indexOf("n"));
        System.out.println("Hello World".indexOf("o"));   // first char index number
        System.out.println("Hello World".lastIndexOf("o"));   // last index of char character

        char o='o';
        String o1 ="o";
        System.out.println("Hello world".replaceFirst("l","*"));
        System.out.println("Hello world".replaceAll("l","*"));
        System.out.println("Hello world".replace("l","*"));
        System.out.println("Hello world".replace(" ",""));
        System.out.println("Hello world".replace(" ","    "));
        System.out.println("Hello world".substring(2));
        System.out.println("Hello world".substring(2,5));
        System.out.println("Hello world".substring(2,5));

        System.out.println("Hello world".substring(0,5)+"==="+"Hello world".substring(6,8));

        System.out.println("Hello world".endsWith("d"));
        System.out.println("Hello world".startsWith("H"));
        System.out.println("Hello world".contains("l"));

        String o11 ="o";
        String o12 =" ";
        System.out.println(o11.isEmpty());
        System.out.println(o12.isBlank());
        String data="DATA";
        String data1="Data";
        System.out.println(data.equals(data1));
        System.out.println(data.equalsIgnoreCase(data1));

        System.out.println(data.contains("DA"));
        System.out.println(data.contains("DAt"));
    }
}
