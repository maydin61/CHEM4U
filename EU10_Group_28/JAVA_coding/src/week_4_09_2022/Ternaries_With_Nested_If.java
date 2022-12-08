package week_4_09_2022;

public class Ternaries_With_Nested_If {
    public static void main(String[] args) {

        int scr = 67;

        String result = (scr >= 0 && scr <= 100) ? (scr >= 60) ? "Passed" : "Failed"
                                                               : "invalid value";
                            // the same number of ? and : must be for correction
        System.out.println(result + "  " + scr);


        System.out.println("=========================");

        if (scr >= 0 && scr <= 100) {
            if (scr >= 60) {
                result="passed";
            } else {
                result="failed";}


        } else{
                result="invalid score";


            }System.out.println(result+" =  "+ scr);
        }
    }
