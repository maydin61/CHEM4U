package JAVA_coding.src.MUHTAR_Practice.day32_CustomClass_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default constructor");
    }
    public ConstructorCalls(int a){
        this();

        System.out.println("constructor with int argument");
       //  this();  here will give you compiler error, must first order
    }
    public ConstructorCalls(String str){
        this( 12);
        System.out.println("constructor with string argument");
    }

    public static void main(String[] args) {
        ConstructorCalls constructorCalls=new ConstructorCalls();
        System.out.println(constructorCalls);
        ConstructorCalls constructorCalls1=new ConstructorCalls(12);
        System.out.println("constructorCalls1 = " + constructorCalls1);
        ConstructorCalls constructorCalls2=new ConstructorCalls("Java");
        System.out.println("constructorCalls2 = " + constructorCalls2);
    }

}
