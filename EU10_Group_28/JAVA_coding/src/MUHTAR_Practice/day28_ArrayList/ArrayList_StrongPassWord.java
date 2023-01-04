package JAVA_coding.src.MUHTAR_Practice.day28_ArrayList;

public class ArrayList_StrongPassWord {
    public static void main(String[] args) {

        String strongPassWord = "Cyde#$%@#%!";
        System.out.println(isPassWordStrong(strongPassWord));
    }
    public static boolean isPassWordStrong(String passWord){

            boolean r1 = passWord.length()>=8 && ! passWord.contains(" ");



            boolean r2=false;
            boolean r3=false;
            boolean r4=false;
            boolean r5=false;

        char [] chars = passWord.toCharArray();
        for (char element:chars){
            if (Character.isUpperCase(element)){
                r2=true;
            } else if (Character.isLowerCase(element)) {
                r3=true;
            } else if (Character.isDigit(element)) {
                r4=true;
            }else {
                r5=true;
            }
        }
        boolean isStrongPass = r1 && r2 && r3 && r4 && r5;
        System.out.println("Strong password");
        return isStrongPass;
    }

}

