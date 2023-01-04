package JAVA_coding.src.PracticeWith_ADAM.week_02_09_2022;

public class TemperatureConverter {
    public static void main(String[] args) {
        /*
        Create class named "TemperatureConverter" and make a main method
                        - Write a Java program to convert temperature from Fahrenheit to Celsius degree
                        - Input a degree in Fahrenheit: 212
                            Formula :         C = (5(F-32))/9
                            Expected Output:
                            212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */
        double F=234;
        double Value2=((5*(F-32))/9);
        float C3= (float) ((5*(F-32))/9);
        int C1= (int) ((5*(F-32))/9);
        System.out.println((int) F +" degree Fahrenheit is equal to:"
                +C1+" in Celsius."+C1 );
        System.out.println(F +" degree Fahrenheit is equal to:"
                +Value2+" in Celsius."+Value2 );
        System.out.println((double) F +" degree Fahrenheit is equal to:"
                +C3+" in Celsius."+C3 );
    }
}
