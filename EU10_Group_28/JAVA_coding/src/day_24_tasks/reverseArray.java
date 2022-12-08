package day_24_tasks;

public class reverseArray {
    public static void main(String[] args) {


        reverse("Aydin");

        // String  str = reverse("Java");
        // String  str1 = reverse("Aydin");
        // System.out.println(str);
        // System.out.println(str1);
    }


    public static String reverse(String word){
        int length=word.length();
        String reverse="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }

}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string
				Ex:
					str = "Java";
					reverse(str) ==> avaJ

 */