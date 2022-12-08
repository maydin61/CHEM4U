package day24CustomMethod_Return_extra;

public class day24_task_isPolinrom {
    public static void main(String[] args) {


        String result0= isPolinrom("Level");
        String result01= isPolinrom("anna");
         isPolinrom("anna");

    }



    public static String isPolinrom(String str){
         String isPolindrom="";
        for (int i = str.length()-1; i >=0 ; i++) {
            isPolindrom += str.charAt(i);
            System.out.println( isPolindrom.equalsIgnoreCase(str));

        }

        return isPolindrom;



    }

}
/*
 By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */
