package JAVA_coding.src.MUHTAR_Practice.day23_Costum_Method_Void_Method_Parameters_Extra;

public class practice1 {
    public static void main(String[] args) {

        reverseData("Java");
        reverseData("Java is FUN");
        reverseData("1234");
        reverseData("Python");

    }

    public static void reverseData(String str) {       // public  , private  , proactive  , default
        int length = str.length();                     // static (call the method through the class name)
        for (int i = length-1; i >=0 ; i--) {          // void ( not return back)   , return method ==> return
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
/*
public static void main (String[]){
}
declaring own method
Access Modifier : public , protected , default , private
specifier       : static, final , abstract , synchronized
return type     : void  , AnyDataType
method name (Parameter) : can be any name(make it ==>> meaning full)





 */