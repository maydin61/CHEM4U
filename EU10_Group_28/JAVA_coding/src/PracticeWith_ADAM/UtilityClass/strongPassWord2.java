package JAVA_coding.src.PracticeWith_ADAM.UtilityClass;

public class strongPassWord2 {
    public static void main(String[] args) {
        String pass="Cyo@#4";
        System.out.println(isStrongPassWord(pass));


    }
    public static char[] isStrongPassWord(String passWord){
        char [] chars = passWord.toCharArray();
        boolean length=passWord.length()>=8;

        int countLowerCase=0;
        int countUpperCase=0;
        int countDigit=0;
        int countSpecialChars=0;
        for (int i = 0; i < passWord.length(); i++) {
            char each=passWord.charAt(i);
            if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            }else {
                countSpecialChars++;
            }
        }
        System.out.println(countLowerCase);
        System.out.println(countUpperCase);
        System.out.println(countDigit);
        System.out.println(countSpecialChars);
        if (countDigit+countLowerCase+countSpecialChars+countUpperCase>=8)
            System.out.println("strong pass");
        else {
            System.out.println("weak pass");
        }
        return chars;
    }
}
