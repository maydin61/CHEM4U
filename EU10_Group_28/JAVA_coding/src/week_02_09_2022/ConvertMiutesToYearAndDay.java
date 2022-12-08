package week_02_09_2022;

public class ConvertMiutesToYearAndDay {
    public static void main(String[] args) {

// Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.
//     60 24 365
//     Input the number of minutes: 3456789
//     Expected Output :
//     3456789 minutes is approximately 6 years and 210 days

        int min=3456789;
        int year=60*24*365;
        int years=min/year;
        int totalDays=min/(60*24);
               System.out.println(min+" minutes is approximately "+years+
                " years and "+(totalDays%365)+" days ");


    }
}
